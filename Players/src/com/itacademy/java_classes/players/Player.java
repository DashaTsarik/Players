package com.itacademy.java_classes.players;

import java.util.Objects;

public class Player {
	
	private String name;
	private String sportType;
	
	public Player(String name, String sportType) {
		this.name = name;
		this.sportType = sportType;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSportType() {
		return sportType;
	}


	public void setSportType(String sportType) {
		this.sportType = sportType;
	}


	public void play() {
		System.out.println("Начать играть в " + sportType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sportType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(name, other.name) && Objects.equals(sportType, other.sportType);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", sportType=" + sportType + "]";
	}
	
	

}
