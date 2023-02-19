package JavaWithDSA.Arrays3;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the cols: ");
        int cols = in.nextInt();

        int[][] matrix = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) { // rows
            for (int j = 0; j < cols; j++) { //cols
                matrix[i][j] = in.nextInt();
            }
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = cols - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            //2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            //3
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }

    }
}