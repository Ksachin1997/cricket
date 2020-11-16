package com.sachin.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.cricket.dao.PointsTableDAO;
import com.sachin.cricket.entities.Point;

@Service
public class PointsTableServiceImpl implements PointsTableService{
	
	@Autowired
	PointsTableDAO ptDAO;
	
	public List<Point> getPointsTable(){
		return ptDAO.findAll();
		
	}

}
