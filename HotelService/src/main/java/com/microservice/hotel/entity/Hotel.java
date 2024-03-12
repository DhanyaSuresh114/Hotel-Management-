package com.microservice.hotel.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

	@Id
	private String hoteId;
	
	private String name;
	
	private String location;
	
	private String about;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
}