package com.bptn.course.ConnectFour;
import java.util.Arrays;
import java.util.Scanner;

public class Board {
	// Stores the current state of the Connect Four board.
	// "-" represents an empty position.
	String[][] board;
	
	private static Scanner userInput = new Scanner(System.in);

	public Board() {
		
		
	}
	
	public void boardSetUp() {
		 System.out.println("------ Board Set up -------");
	     System.out.println("Number of rows: ");
	     int rows = userInput.nextInt();
	     
	     System.out.println("Number of columns: ");
	     int columns = userInput.nextInt();
	     
	     this.board = new String[rows][columns];
	     
	     
	  // Fill each row with "-" so every board position starts empty.
	     for (String[] row : board) {
	    	 Arrays.fill(row, "-");
           
	     }

	     
	}
	
    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("\n");
    }
    
 // A column is full when its top position is no longer empty.
    public boolean columnFull(int col) {
        if (board[0][col].equals("-")) {
            return false;
        }

        return true;
    }
    
    public boolean boardFull() {
        for (int i = 0; i < this.board[0].length; i++) {
            if (!columnFull(i)) {
                return false;
            }
        }
        return true;
    }
    
    
    public boolean addToken(int colToAddToken, String token) {
    	
    	// Prevent the player from selecting a column outside the board.
	   if (colToAddToken < 0 || colToAddToken >= board[0].length) {
	        throw new InvalidMoveException("Invalid column selected.");
	    }
        int rowToAddToken = board.length - 1;

        while (rowToAddToken >= 0) {
            if (board[rowToAddToken][colToAddToken].equals("-")) {
            	board[rowToAddToken][colToAddToken] = token;
                return true;
            } else {
                rowToAddToken -= 1;
            }
        }

        
        throw new ColumnFullException("That column is full. Try again.");
    }
    
    public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        if (checkHorizontal(playerNumber)) {
            return true;
        } else if (checkLeftDiagonal(playerNumber)) {
            return true;
        }else if(checkVertical(playerNumber)) {
        	return true;
        }else if(checkRightDiagonal(playerNumber)) {
        	return true;
        }
        return false;
    }
    
    public boolean checkVertical(String playerNumber) {
        for (int col = 0; col < board[0].length; col++) {
            for (int row = 0; row < board.length - 3; row++) {

                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col].equals(board[row + 1][col])
                            && board[row][col].equals(board[row + 2][col])
                            && board[row][col].equals(board[row + 3][col])) {

                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    public boolean checkHorizontal(String playerNumber) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {

                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col].equals(board[row][col + 1])
                            && board[row][col].equals(board[row][col + 2])
                            && board[row][col].equals(board[row][col + 3])) {

                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    public boolean checkLeftDiagonal(String playerNumber) {
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {

                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col].equals(board[row + 1][col + 1])
                            && board[row][col].equals(board[row + 2][col + 2])
                            && board[row][col].equals(board[row + 3][col + 3])) {

                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    public boolean checkRightDiagonal(String playerNumber) {
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 3; col < board[0].length; col++) {

                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col].equals(board[row + 1][col - 1])
                            && board[row][col].equals(board[row + 2][col - 2])
                            && board[row][col].equals(board[row + 3][col - 3])) {

                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    
    
    public static void main(String[] args) {
    	Board board1 = new Board();
             board1.boardSetUp();
             board1.printBoard();

             board1.addToken(0, "x");
             board1.addToken(0, "x");
             board1.addToken(0, "x");
             board1.addToken(1, "y");
             board1.addToken(1, "z");
             board1.addToken(1, "w");
             board1.addToken(0, "x");

             System.out.println("Board for testing checkVertical");
             System.out.println("Board 1 check vertical with x returns -> " + board1.checkVertical("x"));
             System.out.println("Board 1 check vertical with y returns -> " + board1.checkVertical("y"));

             board1.printBoard();

             Board board2 = new Board();
             // Test with at least a 4-by-4 size board.
             board2.boardSetUp();
             board2.printBoard();

             board2.addToken(0, "x");
             board2.addToken(0, "x");
             board2.addToken(0, "w");
             board2.addToken(0, "w");
             board2.addToken(1, "y");
             board2.addToken(1, "x");
             board2.addToken(1, "w");
             board2.addToken(2, "y");
             board2.addToken(2, "w");
             board2.addToken(2, "x");
             board2.addToken(3, "w");
             board2.addToken(3, "w");
             board2.addToken(3, "w");
             board2.addToken(3, "x");

             System.out.println("Board for testing diagonals");
             System.out.println("Board 2 check right diagonal with x returns -> " + board2.checkRightDiagonal("x"));
             System.out.println("Board 2 check right diagonal y returns -> " + board2.checkRightDiagonal("y"));
             System.out.println("Board 2 check left diagonal w returns -> " + board2.checkLeftDiagonal("w"));

             board2.printBoard();
	     
	}

}

/*
 * The Board class manages the Connect Four board.
 * It creates and initializes the 2D array, prints the board,
 * adds tokens to the lowest available row in a selected column,
 * checks whether columns or the entire board are full,
 * and checks for a winner horizontally, vertically, and diagonally.
 */
