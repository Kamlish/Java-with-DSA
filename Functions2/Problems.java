package JavaWithDSA.Functions2;

import java.util.*;

public class Problems {

    // Sum of n odd numbers
    public static void odd(int n){
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println("\nThe sum is: "+sum);
    }

    public static void GCD (int a, int b) {
        while (a !=b){
            if(a>b){
                a = a - b ;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("\nGCD is: "+b);

    }

    public static void Fibonacci(int n){
        int pre= 0;
        int next = 1;
        int count =1;
        while(count<=n){
            int temp = next;
            next +=pre;
            pre = temp;
            System.out.print(pre+" ");
           count++;
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = input.nextInt();
//        odd(n);
//        int ans = GCD(6,12);
//        System.out.println(ans);

        Fibonacci(10);
        GCD(8,4);

    }
}

