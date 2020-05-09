/*
  TODO:
  - Компьютер "загадывает" целое число от 0 до 100,
	которое необходимо угадать;
  - После каждой попытки выводить подсказки: число больше или
	меньше загаданного;
  - Если число угадано, сообщить: "Вы угадали!";
  - Менять число игрока автоматически;
  - Игра продолжается, пока число не угадано.
 */
public class MyFirstGame {
	public static void main(String[] args) {
		System.out.println("Компьютер загадал число от 0 до 100," + " попробуйте угадать его!");
		int numEntByComp = 37;
		int numEntByPlayer;
		do {
			numEntByPlayer = (int) (Math.random() * 101);
			if(numEntByPlayer > numEntByComp) {
				System.out.println("Введённое вами число больше того," + " что загадал компьютер!");
				System.out.println("Попробуйте ещё раз!");
			} else if(numEntByPlayer < numEntByComp) {
				System.out.println("Введённое вами число меньше того," + " что загадал компьютер!");
				System.out.println("Попробуйте ещё раз!");
			}
		} while(numEntByPlayer != numEntByComp);

		System.out.println("Вы угадали!");
	}
}