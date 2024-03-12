package com.microservice.hotel.service;

import java.util.List;

import com.microservice.hotel.entity.Hotel;

public interface HotelService {

	Hotel saveHotel(Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotel(String id);

	
}
