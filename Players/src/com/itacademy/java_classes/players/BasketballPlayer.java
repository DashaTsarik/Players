package com.itacademy.java_classes.players;

import java.util.Objects;

public class BasketballPlayer extends Player{
	
	private boolean hasBasketballSleeve;
	
	public BasketballPlayer(String name, String sportType, boolean hasBasketballSleeve) {
		super(name, sportType);
		this.hasBasketballSleeve = hasBasketballSleeve;
	}

	public boolean isHasBasketballSleeve() {
		return hasBasketballSleeve;
	}

	public void setHasBasketballSleeve(boolean hasBasketballSleeve) {
		this.hasBasketballSleeve = hasBasketballSleeve;
	}
	
	public void play() {
		if (hasBasketballSleeve == true) {
			System.out.println("Баскетболист надевает баскетбольный рукав");
		}
		System.out.println("Начинает играть в баскетбол.");
		System.out.println("Берет мяч.");
		System.out.println("Бросает мяч в корзину.");
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hasBasketballSleeve);
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
		BasketballPlayer other = (BasketballPlayer) obj;
		return hasBasketballSleeve == other.hasBasketballSleeve;
	}

	@Override
	public String toString() {
		return "BasketballPlayer [hasBasketballSleeve=" + hasBasketballSleeve + ", Name()=" + getName()
				+ ", SportType()=" + getSportType() + "]";
	}
	

}
