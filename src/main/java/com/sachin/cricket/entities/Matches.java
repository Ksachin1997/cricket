package com.sachin.cricket.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Matches {
	
	@Id
	private int matchId;
	private String teama;
	private String teamb;
	private String venue;
	private Date dom;
	private String matchType;
	private String status;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	
	public String getTeama() {
		return teama;
	}
	public void setTeama(String teama) {
		this.teama = teama;
	}
	public String getTeamb() {
		return teamb;
	}
	public void setTeamb(String teamb) {
		this.teamb = teamb;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
