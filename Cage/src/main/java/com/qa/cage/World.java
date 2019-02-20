package com.qa.cage;

public class World {

	public static void main(String[] args) {
		
		Animal cow = new Animal("cow");
		Cage<Animal> cage1 = new Cage<Animal>();
		cage1.insert(cow);
		System.out.println(cage1.get().getType());

		Fruit apple = new Fruit("apple");
		Fruit banana = new Fruit("banana");
		Cage<Fruit> cage2 = new Cage<Fruit>();
		cage2.insert(apple);
		cage2.insert(banana);

		System.out.println(cage2.get().getType());
		System.out.println(cage2.get().getType());
		
	}

}
