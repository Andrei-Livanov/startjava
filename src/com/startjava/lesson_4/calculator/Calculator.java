package com.startjava.lesson_4.calculator;

public class Calculator {
	private String[] mathExpression;
	private int num1;
	private char sign;
	private int num2;

	private void parseExpression(String expression) {
		mathExpression = expression.split("\\s+");
		num1 = Integer.parseInt(mathExpression[0]);
		sign = mathExpression[1].charAt(0);
		num2 = Integer.parseInt(mathExpression[2]);
	}

	public void calculate(String expression) {
		parseExpression(expression);
		switch (sign) {
			case '+':
				System.out.println("Результат равен: " + Math.addExact(num1, num2));
				break;
			case '-':
				System.out.println("Результат равен: " + Math.subtractExact(num1, num2));
				break;
			case '*':
				System.out.println("Результат равен: " + Math.multiplyExact(num1, num2));
				break;
			case '/':
				System.out.println("Результат равен: " + Math.floorDiv(num1, num2));
				break;
			case '^':
				System.out.println("Результат равен: " + (int) Math.pow(num1, num2));
				break;
			case '%':
				System.out.println("Результат равен: " + (num1 % num2));
				break;
			default:
				System.out.println("Error!");
			break;
		}
	}
}