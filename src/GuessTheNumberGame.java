import java.util.Scanner;

public class GuessTheNumberGame {
    public static int run(int rightNumber) {
        Scanner scanner = new Scanner(System.in);
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
}
