package foo.pritch.guessthenumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        List<Player> players = new ArrayList<>();
        players.add(new Player(ui.getPlayerName()));
        players.add(new Player(ui.getPlayerName()));

        GuessTheNumber guessTheNumber = new GuessTheNumber(ui.getMinRange(), ui.getMaxRange());

        GameEngine gameEngine = new GameEngine(ui, players, guessTheNumber);

        gameEngine.runGame();
    }


}

