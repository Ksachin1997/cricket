package com.sachin.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.cricket.dao.PlayerDAO;
import com.sachin.cricket.entities.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	PlayerDAO playerDAO;
	
	public List<Player> getPlayers(){
		
		return playerDAO.findAll();
		
	}

}
