package JavaWithDSA.BitManipulation5;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get Bit (&)
        // Set Bit ( | )
        // Clear Bit (~)
        // Update Bit (Combination of Clear and Set)

        // Q. Get the 3rd bit (position =2) of a number

        // Get Bit (&)
//        int n = 5; // 0101
//        int pos = 2;
//        // BitMask Operation
//        int bitMask = 1<<pos;  // 0100
//
//        if((bitMask & n) == 0){
//            System.out.println("Bit was zero");
//        }
//        else {
//            System.out.println("Bit was one");
//        }


//        // Set Bit (|)
//        int n = 5; // 0101
//        int pos = 1;
//        // BitMask Operation
//        int bitMask = 1<<pos;  // 0010
//
//        int newNumber = (bitMask | n);
//        System.out.println(newNumber);


        // Clear Bit (And with Not) - (1 replace 0)
//        int n = 5; // 0101
//        int pos = 2;
//        // BitMask Operation
//        int bitMask = 1<<pos;  // 0100
//        int notBitMask = ~(bitMask); // 1011
//        int newNumber = (notBitMask & n); // 0001
//        System.out.println(newNumber);


        // Update Bit (Combination of Clear and Set)

        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1<<pos; // 0100
        int op = input.nextInt();

        // operation = 1 : Set (Agar 0 ko 1 karna)
        // operation = 0: Clear (Agar 1 ko zero karna)

        if(op ==1){
            int number = (bitMask | n);
            System.out.println(number);
        }else {
            int newBitMask = ~(bitMask);
            int number = (newBitMask & n);
            System.out.println(number);

        }








    }
}
