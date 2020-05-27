package com.startjava.lesson_2_3.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf w1 = new Wolf();

		w1.setName("Серый");
		System.out.println("Кличка волка: " + w1.getName());
		w1.setGender('м');
		System.out.println("Пол - " + w1.getGender());
		w1.setWeight(49);
		System.out.println("Вес = " + w1.getWeight() + "кг");
		w1.setAge(9);
		w1.setAge(4);
		System.out.println("Возраст " + w1.getAge() + " года");
		w1.setColor("чёрный");
		System.out.println("Окрас " + w1.getColor());

		w1.walk();
		w1.sit();
		w1.run();
		w1.howl();
		w1.hunt();
	}
}