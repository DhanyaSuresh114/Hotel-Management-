package com.microservice.hotel.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.hotel.entity.Rating;


@FeignClient(name= "RATING-SERVICE")
public interface RatingService {
  
	@GetMapping("/ratings/hotels/{hotelId}")
	List<Rating> getRatings(@PathVariable String hotelId);
	
}
