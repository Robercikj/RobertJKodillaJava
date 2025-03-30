package com.kodilla.sudoku;

public class SudokuGame {
    public static boolean resolveSudoku() {
        return true;
    }

    public static void main(String[] args) {
        SudokuBoard board = new SudokuBoard();
        System.out.println(board.toString());
            while(!resolveSudoku()) {
                System.out.println("Próba rozwiązania sudoku");
            }
        System.out.println("Udało się");

    }
}