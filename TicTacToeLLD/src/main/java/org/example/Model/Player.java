package org.example.Model;

public class Player {

    private String name;
    private PlayingPiece pieceType;

    public Player(String name, PlayingPiece pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }

    public String getName() {
        return name;
    }


    public PlayingPiece getPieceType() {
        return pieceType;
    }
}
