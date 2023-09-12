package com.itacademy.java_classes.players;

import java.util.Objects;

public class TennisPlayer extends Player{
	
	private String nameOfTennisRacket;
	
	public TennisPlayer(String name, String sportType, String nameOfTennisRacket) {
		super(name, sportType);
		this.nameOfTennisRacket = nameOfTennisRacket;
	}

	public String getNameOfTennisRacket() {
		return nameOfTennisRacket;
	}

	public void setNameOfTennisRacket(String nameOfTennisRacket) {
		this.nameOfTennisRacket = nameOfTennisRacket;
	}

	public void play() {
		System.out.println("Проводится жеребьевка на подачу");
		System.out.println("Теннисист берет ракетку " + nameOfTennisRacket + " и начинает игру");
		System.out.println("Матч состоит из трех сетов, а сет из 6 геймов.");
		System.out.println("Основная задача - перекинуть мяч на сторону противника так,"
				          + " чтобы он не смог отбить его за сетку");
		System.out.println("Ведет игру с соперником");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nameOfTennisRacket);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TennisPlayer other = (TennisPlayer) obj;
		return Objects.equals(nameOfTennisRacket, other.nameOfTennisRacket);
	}

	@Override
	public String toString() {
		return "TennisPlayer [nameOfTennisRacket=" + nameOfTennisRacket + ", Name()=" + getName()
				+ ", SportType()=" + getSportType() + "]";
	}
	
	

}
