import java.util.Scanner;

public class GuessNumber {

	private int hiddenNum = (int)(Math.random() * 101);
	private Player player1;
	private Player player2;
	Scanner sc = new Scanner(System.in);

	public GuessNumber (Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		while(true) {
			System.out.print("Введите ваше число, " + player1.getName() + ": ");
			int num = sc.nextInt();
			player1.setNumber(num);
			int number = player1.getNumber();
			if(compareNumbers(number)) {
				break;
			}
			System.out.print("Введите ваше число, " + player2.getName() + ": ");
			num = sc.nextInt();
			player2.setNumber(num);
			number = player2.getNumber();
			if(compareNumbers(number)) {
				break;
			}
		}
	}

	private boolean compareNumbers(int number) {
		if(number == hiddenNum) {
			System.out.println("Поздравляем! Вы победитель!");
			return true;
		} else if(number < hiddenNum) {
			System.out.println("Это число меньше, чем загадал компьютер.");
		} else {
			System.out.println("Это число больше, чем загадал компьютер.");
		}
		return false;
	}
}