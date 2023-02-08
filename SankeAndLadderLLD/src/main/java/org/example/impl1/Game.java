package org.example.impl1;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    private Deque<Player> players = new LinkedList<>();
    private Board board;
    private Die die;
    private int finalPosition;
    private Player winner = null;

    public Game(int playerCount , int rows ,int cols ,int dieSides, int dieCount, int numSnakes , int numLadders) {
        if (playerCount < 2) {
            throw new IllegalArgumentException("Player count should be greater than 1");
        }
        if (rows < 2) {
            throw new IllegalArgumentException("Rows should be greater than 1");
        }
        finalPosition = rows * cols-1;

        init(rows,cols,numSnakes,numLadders,dieSides,dieCount,playerCount);
    }

    public void init(int rows,int cols,int numSnakes,int numLadders,int dieSides,int dieCount,int playerCount) {

        board = new Board(rows,cols,numSnakes,numLadders);
        die = new Die(dieSides,dieCount);
        addPlayers(playerCount);

    }

    private void addPlayers(int playerCount) {

        for(int i = 0; i < playerCount; i++){
            players.add(new Player(i));
        }

    }

    public void startGame(){

        while (winner==null) {

            Player playerTurn = players.poll();
            System.out.println("Player " + playerTurn.getId() + " turn"+" position " + playerTurn.getPosition());
            int roll = die.roll();
            System.out.println("Player " + playerTurn.getId() + " rolled " + roll);
            int newPosition = playerTurn.getPosition() + roll;
            if (newPosition > finalPosition) {
                System.out.println("Player " + playerTurn.getId() + " cannot move");
                players.add(playerTurn);
                continue;
            }

            Cell cell = board.getCell(newPosition);

            if (cell.getJump() != null) {
                System.out.println("Player " + playerTurn.getId() + " moved from " + playerTurn.getPosition() + " to " + cell.getJump().getEnd());
                playerTurn.setPosition(cell.getJump().getEnd());
            } else {
                System.out.println("Player " + playerTurn.getId() + " moved from " + playerTurn.getPosition() + " to " + newPosition);
                playerTurn.setPosition(newPosition);
            }

            if (playerTurn.getPosition() == finalPosition) {
                winner = playerTurn;
                System.out.println("Player " + playerTurn.getId() + " won");
                break;
            }

            players.add(playerTurn);

        }


    }



}
