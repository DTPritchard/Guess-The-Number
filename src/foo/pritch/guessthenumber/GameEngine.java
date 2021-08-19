package foo.pritch.guessthenumber;

import java.util.List;

public class GameEngine {

	private GuessTheNumber guessTheNumber;
	private UserInterface ui;
	private List<Player> players;

	public GameEngine(UserInterface ui, List<Player> players, GuessTheNumber guessTheNumber) {
		this.ui = ui;
		this.players = players;
		this.guessTheNumber = guessTheNumber;
	}

	public void runGame() {
		for (int attempt = 0; attempt < 10; attempt++) {
			for (Player player : players) {
				GuessResult guess = guessTheNumber.guess(ui.getGuess(player));
				ui.outputGuessResult(guess);
				if (guess == GuessResult.CORRECT) {
					return;
				}
			}
		}
	}
}
