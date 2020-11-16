package com.sachin.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.cricket.dao.VenueDAO;
import com.sachin.cricket.entities.Venue;

@Service
public class VenueServiceImpl implements VenueService{
	
	@Autowired
	VenueDAO venueDAO;
	
	public List<Venue> getVenues(){
		
		return venueDAO.findAll();
	}

}
