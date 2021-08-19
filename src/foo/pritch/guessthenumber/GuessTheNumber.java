package foo.pritch.guessthenumber;

import java.util.Random;

public class GuessTheNumber {

	private int rightNumber;

	public GuessTheNumber(int min, int max) {
		this.rightNumber = getRandomNumber(min, max);
	}

	public GuessResult guess(int number) {
		if (number == rightNumber) {
			return GuessResult.CORRECT;
		} else if (number > rightNumber) {
			return GuessResult.TOO_HIGH;
		} else {
			return GuessResult.TOO_LOW;
		}
	}

	private static int getRandomNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

}
