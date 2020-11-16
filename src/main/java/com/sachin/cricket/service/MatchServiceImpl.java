package com.sachin.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.cricket.dao.MatchDAO;
import com.sachin.cricket.entities.Matches;

@Service
public class MatchServiceImpl implements MatchService {
	
	@Autowired
	MatchDAO matchDAO;
	
	public List<Matches> getMatches(){
		return matchDAO.findAll();
	}
	
	

}
