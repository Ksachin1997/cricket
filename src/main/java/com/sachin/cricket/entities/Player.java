package com.sachin.cricket.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	private int pid;
	private String name;
	private String imgUrl;
	private Date dob;
	private Date dod;
	private int fifties;
	private int hundreds;
	private int fours;
	private int sixes;
	private int bom;
	private int mom;
	private int fom;
	private String team;
	private int wickets;
	private int runs;
	private String type;
	
	public Player(int pid, String name, String imgUrl, Date dob, Date dod, int fifties, int hundreds, int fours,
			int sixes, int bom, int mom, int fom, String team, int wickets, int runs, String type) {
		super();
		this.pid = pid;
		this.name = name;
		this.imgUrl = imgUrl;
		this.dob = dob;
		this.dod = dod;
		this.fifties = fifties;
		this.hundreds = hundreds;
		this.fours = fours;
		this.sixes = sixes;
		this.bom = bom;
		this.mom = mom;
		this.fom = fom;
		this.team = team;
		this.wickets = wickets;
		this.runs = runs;
		this.type = type;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDod() {
		return dod;
	}

	public void setDod(Date dod) {
		this.dod = dod;
	}

	public int getFifties() {
		return fifties;
	}

	public void setFifties(int fifties) {
		this.fifties = fifties;
	}

	public int getHundreds() {
		return hundreds;
	}

	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public int getBom() {
		return bom;
	}

	public void setBom(int bom) {
		this.bom = bom;
	}

	public int getMom() {
		return mom;
	}

	public void setMom(int mom) {
		this.mom = mom;
	}

	public int getFom() {
		return fom;
	}

	public void setFom(int fom) {
		this.fom = fom;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", imgUrl=" + imgUrl + ", dob=" + dob + ", dod=" + dod
				+ ", fifties=" + fifties + ", hundreds=" + hundreds + ", fours=" + fours + ", sixes=" + sixes + ", bom="
				+ bom + ", mom=" + mom + ", fom=" + fom + ", team=" + team + ", wickets=" + wickets + ", runs=" + runs
				+ ", type=" + type + "]";
	}
	
	
	
	
	

}
