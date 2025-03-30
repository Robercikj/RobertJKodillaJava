package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.List;

public class SudokuRow {
    private int[] cells;

    public List<Integer> numbers;

    public SudokuRow() {
        cells = new int[9];
        numbers = Arrays.asList(0,0,0,0,0,0,0,0,0);
    }
    public int getCell(int index) {
        return cells[index];
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cells.length; i++) {
            sb.append(cells[i]);
            if(i < cells.length -1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
