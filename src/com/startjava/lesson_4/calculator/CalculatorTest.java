package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);

		String answer;
		do {
			System.out.println("Калькулятор может: + , -, *, /, ^, %.");
			System.out.print("Введите математическое выражение (например 5 + 3): ");
			String expression = sc.nextLine();
			calculator.calculate(expression);

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = sc.nextLine();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(answer.equals("yes"));
	}
}