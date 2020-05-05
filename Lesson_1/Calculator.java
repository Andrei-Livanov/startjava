public class Calculator {

	public static void main (String[] args) {

    	/*
          TODO:
          - Создать калькулятор, выполняющий следующие математические
            операции над целыми положительными числами: +, -, *, /, ^, %;
          - Знак математической операции проверять оператором if else;  
          - Вывести результат работы калькулятора с помощью
            System.out.println().
     	 */

		int a;
		int b;

		char sign = '+';    // +, -, *, /, ^, %  знак математической
		                    // операции                                          
        if(sign == '+') {              // сложение
        	int sum = a + b;                 
			System.out.println(sum);
		}
		else if(sign == '-') {         // вычитание
			int subtr = a - b;          
			System.out.println(subtr);
		}
		else if(sign == '*') {         // умножение
			int  multipl = a * b; 
			System.out.println(multipl);
		}
		else if(sign == '/') {         // деление
			int div = a / b;
			System.out.println(div);
		}
		else if(sign == '^') {         // возведение 'a' в степень 'b' 
			int result = 1 ;

			for(int i = 1; i <= b; i++) {
				result = result * a;	
			}

			System.out.println(result);
		}
		else if(sign == '%') {         // остаток от деления
			int remOfDiv = a % b;
			System.out.println(remOfDiv);
		}
	}	
}