package JavaWithDSA.Sorting6;

public class SelectionSort {
    public static void main(String[] args) {

        int [] arr = {7,8,3,1,2};

       for(int i=0; i<arr.length;i++){
            int smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
        }
       for (int i=0; i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }

    // Time complexity 0(n^2)
    // For Sorting We don't use bubble sort because of time complexity.
}
