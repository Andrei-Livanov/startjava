/*
  TODO:
  - Создать калькулятор, выполняющий следующие математические
	операции над целыми положительными числами: +, -, *, /, ^, %;
  - Знак математической операции проверять оператором if else;
  - Вывести результат работы калькулятора с помощью
	System.out.println().
 */
public class Calculator {
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int result;
		char sign = '+';	// +, -, *, /, ^, %  знак математической операции
		if(sign == '+') {				// сложение
			System.out.println(a + b);
		} else if(sign == '-') {		// вычитание
			System.out.println(a - b);
		} else if(sign == '*') {		// умножение
			System.out.println(a * b);
		} else if(sign == '/') {		// деление
			System.out.println(a / b);
		} else if(sign == '^') {		// возведение 'a' в степень 'b'
			result = 1 ;

			for(int i = 1; i <= b; i++) {
				result *= a;
			}

			System.out.println(result);
		} else if(sign == '%') {		// остаток от деления
			System.out.println(a % b);
		}
	}
}