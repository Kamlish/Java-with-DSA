package JavaWithDSA.BitManipulation5;
import java.util.*;

public class Problems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        System.out.print("Enter the number to power or 2 or not: ");
//        int n = input.nextInt();
//        isPowerOf2(n);
//        toggleBitPos(8);
        BinaryToDecimal(10010);
        DecimalToBinary(18);

    }

    // Write a program to find if a number is a power of 2 or not.
    public static void isPowerOf2 (int num){
        if((num & (~(num-1)))==num){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    // Write a program to toggle a bit a position = “pos” in a number “n”.

    public static void toggleBitPos(int num){
       int count0 = 0;
       int count1 = 0;

       // Iterate through all bits
        while (num>0){
            // if bits 1
            if ((num & 1) == 1){
                count1++;
            }
            // if bits 0
            else {
                count0++;
            }
            // Using Shift right operator to decreasing size of bits
            num = num >> 1;
        }
        System.out.println("Count 0s are: "+count0);
        System.out.println("Count 1s are: "+count1);

    }

    public static void BinaryToDecimal(int N){
        int base = 1;
        int sum = 0;

        while (N>0){
             int lastDigit = N % 10;
             N = N / 10;
             sum += lastDigit * base;
             base = base * 2;
        }
        System.out.println(sum);
    }

    public static void DecimalToBinary(int n){
        for (int i=n; i>=0 ;i--){
            int k = n >> i;
            if((k & 1)>0){
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
        }

    }
}
