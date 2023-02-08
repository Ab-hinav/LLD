package org.example.impl1;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private Cell[][] cells;
    private int rows;
    private int cols;

    public Board(int rows,int cols,int numSnakes,int numLadders) {
        this.rows = rows;
        this.cols = cols;
        initBoard();
        addSnakeAndLadders(numSnakes,numLadders);
    }

    private void initBoard(){
        cells = new Cell[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                cells[i][j] = new Cell();
            }
        }
    }

    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }

    private void addSnakeAndLadders(int numOfSnakes,int numOfLadders) {

        while (numOfSnakes>0) {

            int start = ThreadLocalRandom.current().nextInt(1, rows * cols);
            int end = ThreadLocalRandom.current().nextInt(1, rows * cols);

            if (end >= start) {
                continue;
            }

            Jump jump = new Jump(start, end);
            Cell cell = getCell(start);
            cell.setJump(jump);
            numOfSnakes--;

        }

        while (numOfLadders>0) {

            int start = ThreadLocalRandom.current().nextInt(1, rows * cols);
            int end = ThreadLocalRandom.current().nextInt(1, rows * cols);

            if (end <= start) {
                continue;
            }

            Jump jump = new Jump(start, end);
            Cell cell = getCell(start);
            cell.setJump(jump);
            numOfLadders--;

        }



    }



    public Cell getCell(int value){
        int row = value/rows;
        int col = value%cols;
        return cells[row][col];
    }







}
