import java.util.Scanner;

public class GuessNumber {

	private int hiddenNum = (int)(Math.random() * 101);
	private Player player1;
	private Player player2;
	String answer = "yes";
	Scanner sc = new Scanner(System.in);

	public GuessNumber (Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	private boolean checkOut(int number) {
		if(number < hiddenNum) {
			System.out.println("Это число меньше, чем загадал компьютер.");
			return false;
		} else if(number > hiddenNum) {
			System.out.println("Это число больше, чем загадал компьютер.");
			return false;
		}
		System.out.println("Поздравляем! Вы победитель!");
		return true;
	}

	public void startGame() {
		while(answer.equals("yes")) {
			if(answer.equals("yes")) {
				System.out.print("Введите ваше число, " + player1.getName() + ": ");
				int number = player1.setNumber(sc.nextInt());
				boolean digit = checkOut(number);
				if(digit) {
					break;
				}
				System.out.print("Введите ваше число, " + player2.getName() + ": ");
				number = player2.setNumber(sc.nextInt());
				digit = checkOut(number);
				if(digit) {
					break;
				}
			}

			while(true) {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = sc.next();
				if(answer.equals("yes")) break;
				if(answer.equals("no")) break;
			}
		}
	}
}