import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberPlayer {
    public static void run(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int rightNumber = getRandomNumber(min, max);
        int playerOneResult = GuessTheNumberGame.run(rightNumber);
        int playerTwoResult = GuessTheNumberGame.run(rightNumber);
        FindWinner.run(playerOneResult, playerTwoResult);
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}


