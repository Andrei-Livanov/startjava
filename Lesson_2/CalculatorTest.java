import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);

		String answer = "yes";
		while(answer.equals("yes")) {
			System.out.println("Калькулятор может: + , -, *, /, ^, %.");
			System.out.print("Введите первое число: ");
			int num1 = sc.nextInt();
			calculator.setNum1(num1);

			System.out.print("Введите знак математической операции: ");
			char sign = sc.next().charAt(0);
			calculator.setSign(sign);

			System.out.print("Введите второе число: ");
			int num2 = sc.nextInt();
			calculator.setNum2(num2);

			calculator.calculate();
			System.out.print("Результат равен: " + calculator.getResult()+ "\n");

			while(!answer.equals("yes") || !answer.equals("no")) {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = sc.next();
				if(answer.equals("yes")) break;
				if(answer.equals("no")) break;
			}
		}
	}
}