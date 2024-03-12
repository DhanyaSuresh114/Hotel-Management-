package com.microservice.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.hotel.entity.Hotel;
import com.microservice.hotel.entity.Rating;
import com.microservice.hotel.exception.ResourceNotFoundException;
import com.microservice.hotel.external.service.RatingService;
import com.microservice.hotel.repository.HotelRepository;
import com.microservice.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Autowired
	private RatingService ratingService;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHoteId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {

		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		 Hotel hotel = hotelRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel with given id is not found: " + id));
		 
		 List<Rating> ratings = ratingService.getRatings(hotel.getHoteId());
		 System.out.println("hghdg"+hotel.getHoteId());
		 hotel.setRatings(ratings);
		 return hotel;
	}

}