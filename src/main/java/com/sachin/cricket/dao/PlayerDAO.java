package com.sachin.cricket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.cricket.entities.Player;

public interface PlayerDAO extends JpaRepository<Player, Integer>{

}
