package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rowSize;
    private int colSize;
    private char[][] mineField;
    private boolean[][] mines;
    private int remainingCells;

    public MineSweeper(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        this.mineField = new char[rowSize][colSize];
        this.mines = new boolean[rowSize][colSize];
        this.remainingCells = rowSize * colSize - (rowSize * colSize) / 4;
        initializeMineField();
        placeMines();
    }

    private void initializeMineField() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                mineField[i][j] = '-';
            }
        }
    }

    private void placeMines() {
        int mineCount = (rowSize * colSize) / 4;
        Random random = new Random();

        while (mineCount > 0) {
            int row = random.nextInt(rowSize);
            int col = random.nextInt(colSize);
            if (!mines[row][col]) {
                mines[row][col] = true;
                mineCount--;
            }
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (remainingCells > 0) {
            printMineField();
            int row, col;
            do {
                System.out.print("Select row (0-" + (rowSize - 1) + "): ");
                row = scanner.nextInt();
                System.out.print("Select column (0-" + (colSize - 1) + "): ");
                col = scanner.nextInt();
            } while (!isValidPoint(row, col));

            if (mines[row][col]) {
                System.out.println("You stepped on a mine! You lost the game!");
                printMineLocations();
                return;
            }

            int mineCount = countAdjacentMines(row, col);
            mineField[row][col] = (char) (mineCount + '0');
            remainingCells--;
        }

        printMineField();
        System.out.println("Congratulations! You cleared all the mines. You won the game!");
    }

    private boolean isValidPoint(int row, int col) {
        return row >= 0 && row < rowSize && col >= 0 && col < colSize;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;
                if (isValidPoint(newRow, newCol) && mines[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void printMineField() {
        System.out.println("\nMinesweeper Status:");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(mineField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void printMineLocations() {
        System.out.println("\nMine Locations:");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (mines[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
