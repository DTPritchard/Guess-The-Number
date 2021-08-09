public class FindWinner {
    public static void run(int playerOneResult, int playerTwoResult) {
        if (playerOneResult < playerTwoResult) {
            System.out.println("Player one is the winner!");
        } else if (playerOneResult > playerTwoResult)
            System.out.println("Player two is the winner!");
        else if (playerOneResult == playerTwoResult) {
            System.out.println("It's a tie!");
        }
    }
}
