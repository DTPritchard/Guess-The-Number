package foo.pritch.guessthenumber;

import java.util.Scanner;

public class UserInterface {

	private Scanner scanner = new Scanner(System.in);

	public String getPlayerName() {
		System.out.println("Enter player name:");
		return scanner.next();
	}

	public int getGuess(Player player) {
		System.out.println("Enter guess " + player.getName() + ":");
		return getIntInput();
	}

	public int getMinRange() {
		System.out.println("Enter min range:");
		return getIntInput();
	}

	public int getMaxRange() {
		System.out.println("Enter max range:");
		return getIntInput();
	}

	private int getIntInput() {
		return scanner.nextInt();
	}

	public void outputGuessResult(GuessResult guess) {
		switch (guess) {
			case CORRECT:
				System.out.println("You guessed the correct number!");
				return;
			case TOO_HIGH:
				System.out.println("Wrong! Guess lower");
				return;
			case TOO_LOW:
				System.out.println("Wrong! Guess higher");
				return;
		}

		throw new RuntimeException("Invalid guess " + guess);
	}
}
