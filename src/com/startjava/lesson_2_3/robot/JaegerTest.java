package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger j1 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9, 8, 6);
		Jaeger j2 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.5f, 1.85f, 10, 10, 9);

		j1.technicalInfo();
		j2.technicalInfo();

		j1.getModelName();
		j1.drift();
		j2.getModelName(); 
		j2.drift();

		j1.dist = 100;
		j1.getModelName();
		j1.move();
		j2.dist = 200;
		j2.getModelName();
		j2.move();

		j1.getModelName();
		j1.scanKaiju();
	}
}