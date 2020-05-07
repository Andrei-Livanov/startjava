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
		char sign = '+';	// +, -, *, /, ^, %  знак математической
		                	// операции
		if(sign == '+') {                // сложение
        	result = a + b;                 
			System.out.println(result);
		} else if(sign == '-') {         // вычитание
			result = a - b;          
			System.out.println(result);
		} else if(sign == '*') {         // умножение
			result = a * b; 
			System.out.println(result);
		} else if(sign == '/') {         // деление
			result = a / b;
			System.out.println(result);
		} else if(sign == '^') {         // возведение 'a' в степень 'b' 
			result = 1 ;

			for(int i = 1; i <= b; i++) {
				result *= a;	
			}

			System.out.println(result);
		} else if(sign == '%') {         // остаток от деления
			result = a % b;
			System.out.println(result);
		}
	}	
}