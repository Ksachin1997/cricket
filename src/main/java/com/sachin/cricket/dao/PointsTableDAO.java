package com.sachin.cricket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.cricket.entities.Point;

public interface PointsTableDAO extends JpaRepository<Point, Integer>{

}
