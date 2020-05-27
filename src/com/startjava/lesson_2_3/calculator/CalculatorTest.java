package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);

		String answer;
		do {
			System.out.println("Калькулятор может: + , -, *, /, ^, %.");
			System.out.print("Введите первое число: ");
			calculator.setNum1(sc.nextInt());

			System.out.print("Введите знак математической операции: ");
			calculator.setSign(sc.next().charAt(0));

			System.out.print("Введите второе число: ");
			calculator.setNum2(sc.nextInt());

			System.out.print("Результат равен: " + calculator.calculate()+ "\n");

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = sc.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(answer.equals("yes"));
	}
}