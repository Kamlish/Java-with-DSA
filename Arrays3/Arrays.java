package JavaWithDSA.Arrays3;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = in.nextInt();

        int[] numbers = new int [size];

        System.out.println("Enter the numbers: ");
        for (int i=0; i<size;i++){
            numbers[i] = in.nextInt();
        }

        System.out.println("Enter number to search: ");
        int s = in.nextInt();

        for (int i=0; i<=numbers.length; i++){  //linear search Algorithm
           if (numbers[i]==s){
               System.out.println(s+" found at index: "+i);
           }
        }


    }
}
