import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static int run(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int rightNumber = getRandomNumber(min, max);
        int number = -1;
        int numberOfAttempts = 0;
        while (number != rightNumber) {
            System.out.println("Enter a number:");
            number = scanner.nextInt();
            if (number == rightNumber) {
                System.out.println(String.format("Correct! The number is %d", rightNumber));
            } else if (number > rightNumber) {
                System.out.println("Wrong! Guess lower");
                numberOfAttempts ++;
            } else {
                System.out.println("Wrong Guess higher");
                numberOfAttempts ++;
            }

        }
        return numberOfAttempts;
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}

