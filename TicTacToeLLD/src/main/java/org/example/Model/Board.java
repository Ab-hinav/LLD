package org.example.Model;

public class Board {

    private int size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public void setPiece(int x, int y, PlayingPiece piece) {
        this.board[x][y] = piece;
    }

    public int getSize() {
        return size;
    }


    public PlayingPiece getPiece(int x, int y) {

    return board[x][y] ;
    }
}
