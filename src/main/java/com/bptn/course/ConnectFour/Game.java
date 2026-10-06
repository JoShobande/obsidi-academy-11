package com.bptn.course.ConnectFour;

import java.util.Scanner;

public class Game {

    private Player[] players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);

    public Game() {
      
        this.players = new Player[2];
        this.board = new Board();
    }

    public void setUpGame() {
        System.out.println("Enter player 1's name: ");
        players[0] = new Player(scanner.nextLine(), "1");
        System.out.println("Enter player 2's name: ");
        String playerTwoName = scanner.nextLine();
     // Continue asking for player 2's name until it is different
        while(playerTwoName.equals(players[0].getName())) {
        	System.out.println("Error! Both Players cannot have the same name.");
            System.out.println("Enter player 2's name: ");
        	playerTwoName = scanner.nextLine();
        }
        
       
        players[1] = new Player(playerTwoName, "2");
        
        board.boardSetUp();
        board.printBoard();

      
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner");
    }

    public void playerTurn(Player currentPlayer) {
        boolean tokenAdded = false;
     // Keep asking the current player for a move until a token
     // is successfully added to the board.
        while (!tokenAdded) {
            try {
                int col = currentPlayer.makeMove();

                tokenAdded = board.addToken(
                    col,
                    currentPlayer.getPlayerNumber()
                );

            } catch (InvalidMoveException e) {
                System.out.println(e.getMessage());

            } catch (ColumnFullException e) {
                System.out.println(e.getMessage());
            }
        }

        board.printBoard();
    }

    public void play() {
        boolean noWinner = true;
        this.setUpGame();
        int currentPlayerIndex = 0;

        while (noWinner) {
            if (board.boardFull()) {
                System.out.println("Board is now full. Game Ends.");
                return;
            }

            Player currentPlayer = players[currentPlayerIndex];
           
            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
            playerTurn(currentPlayer);
            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
                printWinner(currentPlayer);
                noWinner = false;
            } else {
                currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
            }
        }
    }

}

/*

 * It creates the players and board, sets up the game, changes player turns,
 * handles exceptions, switches between players,
 * checks for a winner, and ends the game when someone wins or the board is full.
 */

