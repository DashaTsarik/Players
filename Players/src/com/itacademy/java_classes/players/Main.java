package com.itacademy.java_classes.players;

public class Main {

	public static void main(String[] args) {
		
		Player basketballPlayer = new BasketballPlayer("Джон", "Баскетбол", true);
		basketballPlayer.play();
		System.out.println();
		
		Player tennisPlayer = new TennisPlayer("Сью", "Теннис", "HEAD GRAPHENE 360+ PRESTIGE MID 2020");
		tennisPlayer.play();
		System.out.println();
		
		Player footballPlayer = new FootballPlayer("Джейсон", "Футбол", 5);
		footballPlayer.play();
		System.out.println();

	}

}
