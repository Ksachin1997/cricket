package com.sachin.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.cricket.entities.Matches;
import com.sachin.cricket.entities.Player;
import com.sachin.cricket.entities.Point;
import com.sachin.cricket.entities.Team;
import com.sachin.cricket.entities.Venue;
import com.sachin.cricket.service.MatchService;
import com.sachin.cricket.service.PlayerService;
import com.sachin.cricket.service.PointsTableService;
import com.sachin.cricket.service.TeamService;
import com.sachin.cricket.service.VenueService;

@RestController("cricket")
public class MyController {
	
	@Autowired
	PlayerService playerService;
	
	@Autowired
	TeamService teamService;
	
	@Autowired
	VenueService venueService;
	
	@Autowired
	MatchService matchService;
	
	@Autowired
	PointsTableService ptService;
	
	@GetMapping("/players")
	public List<Player> getPlayers(){
		return playerService.getPlayers();
	}
	
	@GetMapping("/teams")
	public List<Team> getTeams(){
		return teamService.getTeams();
	}
	
	@GetMapping("/venues")
	public List<Venue> getVenues(){
		return venueService.getVenues();
	}
	
	@GetMapping("/pointstable")
	public List<Point> getPointsTables(){
		return ptService.getPointsTable();
	}
	
	@GetMapping("/match")
	public List<Matches> getMatch(){
		return matchService.getMatches();
	}
	
	
}
