package com.sachin.cricket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.cricket.entities.Matches;

public interface MatchDAO extends JpaRepository<Matches, Integer>{

}
