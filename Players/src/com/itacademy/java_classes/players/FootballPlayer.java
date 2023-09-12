package com.itacademy.java_classes.players;

import java.util.Objects;

public class FootballPlayer extends Player{
	
	private int quantityOfBalls;

	public FootballPlayer(String name, String sportType, int quantityOfBalls) {
		super(name, sportType);
		this.quantityOfBalls = quantityOfBalls;
	}

	public int getQuantityOfBalls() {
		return quantityOfBalls;
	}

	public void setQuantityOfBalls(int quantityOfBalls) {
		this.quantityOfBalls = quantityOfBalls;
	}
	
	public void play() {
		System.out.println("Футболист выбирает мяч из " + quantityOfBalls + " своих мячей.");
		System.out.println("Главная задача футбола - забить мяч в ворота противника.");
		System.out.println("Начинаетcя матч.");
		System.out.println("Бьет мяч в ворота противника.");
		System.out.println("Отбивает мяч от своих ворот.");
		System.out.println("Передает мяч другому игроку.");
		System.out.println("Принимает мяч и опять бьет в ворота противника.");

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(quantityOfBalls);
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
		FootballPlayer other = (FootballPlayer) obj;
		return quantityOfBalls == other.quantityOfBalls;
	}

	@Override
	public String toString() {
		return "FootballPlayer [quantityOfBalls=" + quantityOfBalls + ", Name()=" + getName() + ", SportType()="
				+ getSportType() + "]";
	}
	
	

}
