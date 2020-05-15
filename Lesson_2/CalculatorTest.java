import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);

		boolean yn = true;
		while(yn) {
			System.out.println("Введите первое число");
			calculator.num1 = sc.nextInt();

			System.out.println("Введите знак математической операции:");
			System.out.println("+ , -, *, /, ^, %");
			calculator.sign = sc.next().charAt(0);

			System.out.println("Введите второе число");
			calculator.num2 = sc.nextInt();

			calculator.calc();

			boolean checking = true;
			while(checking) {
				System.out.print("Хотите продолжить? [yes/no]:");
				String answer = sc.next();
				if(answer.equals("yes")) {
					checking = false;
				} if(answer.equals("no")) {
					checking = false;
					yn = false;
				}
			}
		}
	}
}