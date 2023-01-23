package com.SecondDayJava;

public class Animal implements Carnivorous,Herbivorous{


	public void Eat_Non_Vegeterian_Food() {
	      System.out.println("Animal is Carnivorous");
	   }
	   public void Eat_Vegeterian_Food() {
	      System.out.println("Animal is Herbivorous");
	   }
	
	}
