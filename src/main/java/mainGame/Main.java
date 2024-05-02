package mainGame;

import java.util.List;
import java.util.Scanner;
import models.*;
import controllers.GameController;
import Exception.InvalidMoveException;

public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        int dimension = 3;
        List<Player> players = List.of(
                new Player("Vatsal", new Symbol('X'), PlayerType.HUMAN),
                new Bot("Pedro", new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY)
        );

        Game game = gameController.startGame(dimension, players);
        //gameController.printBoard(game);

        while (game.getGameState().equals(GameState.IN_PROGRESS)) {
            //1. print the board.
            gameController.printBoard(game);

            //2. Player's turn
            gameController.makeMove(game);
        }

        if (!gameController.checkState(game).equals(GameState.ENDED)) {
            game.setGameState(GameState.DRAW);
            System.out.println("DRAW");
        } else {
            gameController.printBoard(game);
            System.out.println("Player " + gameController.getWinner(game).getName() + " is the winner");
        }
    }
}
