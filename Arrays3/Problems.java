package JavaWithDSA.Arrays3;

public class Problems {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        MinMax(arr);
        order(arr);

    }

    // 1. Method to find Min Max Value
    public static void MinMax(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length-1];

        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void order(int[] arr) {

        boolean isAscending = true;

        for(int i=0; i< arr.length-1 ;i++){

            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("Array Sorted");
        }
        else {
            System.out.println("Array Not sorted");
        }
    }

}

