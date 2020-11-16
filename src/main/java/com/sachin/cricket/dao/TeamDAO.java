package com.sachin.cricket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.cricket.entities.Team;

public interface TeamDAO extends JpaRepository<Team, Integer> {

}
