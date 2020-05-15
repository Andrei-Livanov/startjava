public class Calculator {

	int num1;
	int num2;
	char sign;

	public void calc() {
		switch(sign) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			case '^':
				int result = 1;
				for(int i = 1; i <= num2; i++) {
					result *= num1;
				}
				System.out.println(result);
				break;
			case '%':
				System.out.println(num1 % num2);
				break;
		}
	}
}