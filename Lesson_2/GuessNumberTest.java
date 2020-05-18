import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		System.out.println("Компьютер загадал число от 0 до 100, попробуйте угадать его!");
		// Первый игрок
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите ваше имя: ");
		String name = sc.nextLine();
		Player player1 = new Player(name);
		System.out.println("Имя первого игрока: " + player1.getName());
		// Второй игрок
		System.out.print("Введите ваше имя: ");
		name = sc.nextLine();
		Player player2 = new Player(name);
		System.out.println("Имя второго игрока: " + player2.getName());
		// Начало игры
		GuessNumber play = new GuessNumber(player1, player2);
		play.startGame();
	}
}