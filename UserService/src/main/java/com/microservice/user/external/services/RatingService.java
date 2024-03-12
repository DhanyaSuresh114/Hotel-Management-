package com.microservice.user.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.microservice.user.entity.Rating;

@FeignClient(name= "RATING-SERVICE")
public interface RatingService {
  
	@GetMapping("/ratings/users/{userId}")
	List<Rating> getRatings(@PathVariable String userId);
	
	//get
	
	//post
	@PostMapping("/ratings")
	public Rating createRating(Rating rating);
	
	//put
	@PutMapping("/ratings/{ratingId}")
	public Rating updateRating(@PathVariable String ratingId,Rating rating);
	
}
