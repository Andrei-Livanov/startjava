public class Calculator {

	private int num1;
	private int num2;
	private char sign;
	private int result;

	void setSign(char sign) {
		this.sign = sign;
	}

	void setNum1(int num1) {
		this.num1 = num1;
	}

	void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void calculate() {
		switch(sign) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '^':
				result = 1;
				for(int i = 1; i <= num2; i++) {
					result *= num1;
				}
				break;
			case '%':
				result = num1 % num2;
				break;
		}
	}
}