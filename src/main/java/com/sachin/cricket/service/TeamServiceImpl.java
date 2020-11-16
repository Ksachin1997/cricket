package com.sachin.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.cricket.dao.TeamDAO;
import com.sachin.cricket.entities.Team;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	TeamDAO teamDAO;
	
	public List<Team> getTeams(){
		
		return teamDAO.findAll();
	}

}
