package com.startjava.lesson_2_3.wolf;

public class Wolf {

	private char gender;
	private String name;
	private int weight;
	private int age;
	private String color;

	public char getGender() {
		return gender;
	}

	void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст!");
		} else this.age = age;
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public void walk() {
		System.out.println(name + " идёт");
	}

	public void sit() {
		System.out.println(name + " сидит");
	}

	public void run() {
		System.out.println(name + " бежит");
	}

	public void howl() {
		System.out.println("Ауу-аууу");
	}

	public void hunt() {
		System.out.println(name + " на охоте!");
	}
}