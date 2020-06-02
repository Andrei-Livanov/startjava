package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

	private int hiddenNum = (int)(Math.random() * 101);
	private Player player1;
	private Player player2;
	private int attemptNumber;
	Scanner sc = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		attemptNumber = 1;
		while(attemptNumber <= 10) {
			System.out.print("Введите ваше число, " + player1.getName() + ": ");
			player1.setNumber(attemptNumber, sc.nextInt());
			player1.getNumber(attemptNumber);
			if(compareNumbers(player1)) {
				break;
			}
			System.out.print("Введите ваше число, " + player2.getName() + ": ");
			player2.setNumber(attemptNumber, sc.nextInt());
			player2.getNumber(attemptNumber);
			if(compareNumbers(player2)) {
				break;
			}
			attemptNumber++;
		}
		finishGame(player1);
		finishGame(player2);
	}

	private boolean compareNumbers(Player player) {
		if(player.getNumber(attemptNumber) == hiddenNum) {
			System.out.println("Поздравляем! Игрок " +
								player.getName() +" угадал число " +
								player.getNumber(attemptNumber) + " с " +
								attemptNumber + " попытки!" );
			return true;
		} else if(player.getNumber(attemptNumber) < hiddenNum) {
			System.out.println("Это число меньше, чем загадал компьютер.");
		} else {
			System.out.println("Это число больше, чем загадал компьютер.");
		}

		if(attemptNumber == 10) {
			System.out.println("У " + player.getName() + " закончились попытки.");
		}
		return false;
	}

	private void finishGame(Player player) {
		displayNumbers(player);
		zeroize(player);
	}

	private void displayNumbers(Player player) {
		int[] numbers = player.getNumbers(attemptNumber);
		System.out.print(player.getName() + " ввёл эти числа: " );
		System.out.println(Arrays.toString(numbers) + ".");
	}

	private void zeroize(Player player) {
		player.zeroize(attemptNumber);
	}
}