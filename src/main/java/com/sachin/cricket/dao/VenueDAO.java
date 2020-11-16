package com.sachin.cricket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.cricket.entities.Venue;

public interface VenueDAO extends JpaRepository<Venue, Integer>{

}
