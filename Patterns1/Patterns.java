package Patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* 1 Solid Rectangle

         *****
         *****
         *****
         *****

         */

//        for (int i = 0; i<n; i++) //rows
//        {
//            for (int j =0; j<m;j++) //colums
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /* 2 Hollow Rectangle

         *  *  *  *  *
         *           *
         *           *
         *  *  *  *  *

         */

//        for (int i=1; i<=4; i++){
//            for (int j=1; j<=5;j++) {
//                if (i == 1 || j == 1 || i == 4 || j == 5) {
//                    System.out.print(" * ");
//                } else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


        /* 3 Half Pyramid

         *
         **
         ***
         ****

         */

//        for (int i=1 ; i<=4; i++){
//            for(int j=1 ; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /* 4 Half Pyramid

         ****
         ***
         **
         *

         */

//        for (int i=4 ; i>=1; i--){
//            for(int j=1 ; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /* 5 Inverted & Rotated Half Pyramid

         *
         **
         ***
         ****
         */

//        for (int i=1; i<=4; i++){
//            for (int j=1; j<=4-i; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /* 6 Half Pyramid with Numbers

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=i;){
//                System.out.print(j++ +" ");
//            }
//            System.out.println();
//        }

         /* 7 Inverted Half Pyramid with Numbers

        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5-i+1;){
//                System.out.print(j++ +" ");
//            }
//            System.out.println();
//        }

        /* 8. Floyd's Triangle

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

         */

//        int number = 1;
//        for (int i=1; i<=5;i++) {
//            for(int j=1; j<=i;j++){
//                System.out.print(number +" ");
//                number++;
//            }
//            System.out.println();
//        }


        /*9.  0-1 Triangle
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

         */


//        for (int i=1; i<=5;i++) {
//            for(int j=1; j<=i;j++){
//                int sum= i+j;
//                if(sum % 2 == 0){
//                    System.out.print("1"+" ");
//                }
//                else {
//                    System.out.print("0"+" ");
//                }
//            }
//            System.out.println();
//        }


        /* 10. Butterfly

         *                    *
         *  *              *  *
         *  *  *        *  *  *
         *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *
         *  *  *        *  *  *
         *  *              *  *
         *                    *

         */

//        // Upper Half
//        for (int i=1;i<=4;i++){  // print stars
//            for(int j=1; j<=i; j++){
//                System.out.print(" * ");
//            }
//            int space = (2*(4-i)); // print spaces
//            for (int j=1;j<=space;j++){
//                System.out.print("   ");
//            }
//            for (int j=1; j<=i; j++){ // print star after spaces
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        //Lower Half
//        for(int i =1; i<=4; i++){
//            for (int j=1; j<=5-i;j++){
//                System.out.print(" * ");
//            }
//            int spaceI = (2*(i-1)); // print spaces
//            for (int j=1;j<=spaceI;j++) {
//                System.out.print("   ");
//            }
//            for (int j=1; j<=5-i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        /*
                        *  *  *  *  *
                     *  *  *  *  *
                  *  *  *  *  *
               *  *  *  *  *
            *  *  *  *  *

         */


//        for (int i = 1; i <= 5; i++) {
//            //spaces
//            for (int j = 1; j <= 5-i; j++) {
//                System.out.print(" ");
//            }
//            //stars
//            for (int j=1; j<=5;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        /* 12. Number Pyramid

        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
         */

//        for (int i =1; i<=5;i++){
//            //spaces
//            for (int j=1; j<=5-i;j++){
//                System.out.print(" ");
//            }
//            // numbers
//            for (int j=1; j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }



        /* 13. Palindromic Pattern

            1
           212
          32123
         4321234
        543212345

         */


//        for (int i = 1; i<=5; i++){
//            for(int j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for (int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        /* Diamond Pattern

            *
           ***
          *****
         *******
         *******
          *****
           ***
            *
         */

        // Upper Half
        for (int i=1; i<=4;i++){
            // spaces
            for (int j=1 ; j<=4-i;j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=1+(i-1)*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //InnerHalf
        for(int i=1; i<=4;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(7+(i-1)*-2);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


