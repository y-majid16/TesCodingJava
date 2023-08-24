import java.util.Scanner;

public class SpiralAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        char[][] spiralGrid = generateSpiralGrid(inputText);
        printSpiralGrid(spiralGrid);
    }

    public static char[][] generateSpiralGrid(String input) {
        int size = (int) Math.ceil(Math.sqrt(input.length()));
        char[][] grid = new char[size][size];

        int row = 0, col = 0, index = 0;
        int direction = 0;  // 0: right, 1: down, 2: left, 3: up

        while (index < input.length()) {
            grid[row][col] = input.charAt(index);
            index++;

            if (direction == 0) {
                if (col + 1 < size && grid[row][col + 1] == 0)
                    col++;
                else
                    direction = 1;
            } else if (direction == 1) {
                if (row + 1 < size && grid[row + 1][col] == 0)
                    row++;
                else
                    direction = 2;
            } else if (direction == 2) {
                if (col - 1 >= 0 && grid[row][col - 1] == 0)
                    col--;
                else
                    direction = 3;
            } else if (direction == 3) {
                if (row - 1 >= 0 && grid[row - 1][col] == 0)
                    row--;
                else
                    direction = 0;
            }
        }

        return grid;
    }

    public static void printSpiralGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0)
                    System.out.print(grid[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}