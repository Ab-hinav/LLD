package org.example.impl2;

import org.example.impl1.Die;
import org.example.impl1.Jump;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Deque<Player> players= new LinkedList<>();
    private HashMap<Integer, Jump> jumps = new HashMap<>();
    private Die die;
    private int startPosition;
    private int finalPosition;


    public Game(int startPosition,int finalPosition,int playerCount,int dieSides,int dieCount,int numSnakes,int numLadders){
        this.startPosition = startPosition;
        this.finalPosition = finalPosition;
        this.die = new Die(dieSides,dieCount);
        addPlayers(playerCount);
        setJumps(numSnakes,numLadders);
    }

    private void addPlayers(int playerCount) {

        for(int i = 0; i < playerCount; i++){
            players.add(new Player(i,startPosition));
        }

    }

    public void startGame(){
        while (true) {
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
            Jump jump = jumps.get(newPosition);
            if (jump != null) {
                System.out.println("Player " + playerTurn.getId() + " moved from " + playerTurn.getPosition() + " to " + jump.getEnd());
                playerTurn.setPosition(jump.getEnd());
            } else {
                playerTurn.setPosition(newPosition);
            }
            if (playerTurn.getPosition() == finalPosition) {
                System.out.println("Player " + playerTurn.getId() + " wins");
                break;
            }
            players.add(playerTurn);
        }
    }

    private void setJumps(int numSnakes, int numLadders) {

        for(int i = 0; i < numSnakes; i++){
            int start = ThreadLocalRandom.current().nextInt(startPosition, finalPosition+1);
            int end = ThreadLocalRandom.current().nextInt(startPosition, finalPosition+1);
            if (end >= start) {
                continue;
            }
            jumps.put(start,new Jump(start,end));
        }

        for(int i = 0; i < numLadders; i++){
            int start = ThreadLocalRandom.current().nextInt(startPosition, finalPosition+1);
            int end = ThreadLocalRandom.current().nextInt(startPosition, finalPosition+1);
            if (end <= start) {
                continue;
            }
            jumps.put(start,new Jump(start,end));
        }

    }


}
