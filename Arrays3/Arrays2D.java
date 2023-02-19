package JavaWithDSA.Arrays3;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the cols: ");
        int cols = in.nextInt();

        int[][] arr = new int [rows][cols];

        // input
        for (int i=0; i<rows;i++){ // rows
            for (int j=0;j<cols;j++){ //cols
                arr[i][j] = in.nextInt();
            }
        }

        // output
        for (int j=0; j<cols;j++){
            for (int i=0;i<rows;i++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number you want search index: ");
        int search = in.nextInt();

        for (int i=0; i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                if (search == arr[i][j]) {
                    System.out.print(search+" number location is:  ("+ i + ", " + j +")");
                }
            }
        }

    }
}
