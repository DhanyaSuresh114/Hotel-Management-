package com.microservice.rating.service;

import java.util.List;

import com.microservice.rating.entity.Rating;

public interface RatingService {

	// create
	Rating saveRating(Rating rating);

	// get all ratings
	List<Rating> getRatings();

	// get all by UserId
	List<Rating> getRatingByUserId(String userId);

	// get all by UserId
	List<Rating> getRatingByHotelId(String hotelId);
}