package org.example;

import org.example.Model.Board;
import org.example.Model.PieceType;
import org.example.Model.Player;
import org.example.Model.PlayingPiece;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    Board board;

    TicTacToeGame(){
        initializeGame();
    }

    private void initializeGame() {
         players = new LinkedList<>();
         Player player1 = new Player("Player 1", new PlayingPiece(PieceType.X));
         Player player2 = new Player("Player 2", new PlayingPiece(PieceType.O));

         players.add(player1);
         players.add(player2);

         board = new Board(3);
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameIsOver = false;
        int freeSpaces = board.getSize() * board.getSize();

        while(!gameIsOver){

            Player currentPlayer = players.pop();
            System.out.println(currentPlayer.getName() + " it's your turn");
            System.out.println("Please enter the x & y coordinate");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            PlayingPiece piece = currentPlayer.getPieceType();

            if (x < 0 || x >= board.getSize() || y < 0 || y >= board.getSize()) {
                System.out.println("Invalid coordinates");
                players.addFirst(currentPlayer);
                continue;
            }

            if (board.getPiece(x, y) == null) {
                board.setPiece(x, y, piece);
                freeSpaces--;
            } else {
                System.out.println("This space is already taken");
                players.addFirst(currentPlayer);
                continue;
            }

            if (checkForWinner(piece)) {
                System.out.println(currentPlayer.getName() + " has won the game");
                gameIsOver = true;
            } else if (freeSpaces == 0) {
                System.out.println("The game is a draw");
                gameIsOver = true;
            } else {
                players.add(currentPlayer);
            }

            visualizeBoard();

        }

    }

    private void visualizeBoard() {

        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                PlayingPiece piece = board.getPiece(i, j);
                if (piece == null) {
                    System.out.print(" ");
                } else {
                    if (piece.getType() == PieceType.X) {
                        System.out.print("X");
                    } else if (piece.getType() == PieceType.O) {
                        System.out.print("O");
                    }
                }
                if (j < board.getSize() - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < board.getSize() - 1) {
                for (int j = 0; j < board.getSize(); j++) {
                    System.out.print("-");
                    if (j < board.getSize() - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }


    }

    private boolean checkForWinner(PlayingPiece piece) {

        int size = board.getSize();
        int count = 0;

        // Check rows
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board.getPiece(i, j) == piece) {
                    count++;
                }
            }
            if (count == size) {
                return true;
            }
            count = 0;
        }

        // Check columns
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board.getPiece(j, i) == piece) {
                    count++;
                }
            }
            if (count == size) {
                return true;
            }
            count = 0;
        }

        // Check diagonals
        for (int i = 0; i < size; i++) {
            if (board.getPiece(i, i) == piece) {
                count++;
            }
        }
        if (count == size) {
            return true;
        }
        count = 0;

        for (int i = 0; i < size; i++) {
            if (board.getPiece(i, size - i - 1) == piece) {
                count++;
            }
        }
        if (count == size) {
            return true;
        }

        return false;


    }


}
