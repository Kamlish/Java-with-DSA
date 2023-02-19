package JavaWithDSA.Sorting6;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int [] arr = new int [5];
       int [] arr = {7,8,3,1,2,0};

       for (int i=0; i<arr.length;i++){
           for (int j=0; j<arr.length-1-i; j++){
               if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
               }
           }
        }
       for (int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");

       }

       // Time complexity 0(n^2)
        // For Sorting We don't use bubble sort because of time complexity.
    }
}

