package JavaWithDSA.Sorting6;
import java.util.Arrays;

public class QuickSort {

        public static void sort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                sort(arr, low, pivotIndex);
                sort(arr, pivotIndex + 1, high);
            }
        }

        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[low];
            int i = low - 1;
            int j = high + 1;
            while (true) {
                do {
                    i++;
                } while (arr[i] < pivot);

                do {
                    j--;
                } while (arr[j] > pivot);

                if (i >= j) {
                    return j;
                }

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {3,5,2,1,6,8,9,0};
            sort(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
    }
}



//    public static int partition(int arr[], int low,int high){
//
//        int pivot = arr[high];
//        int i = low-1;
//
//        for (int j=low;j<high;j++){
//            if (arr[j]<pivot){
//                i++; // Tracting empty place
//                // Swap
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        i++;
//        int temp = arr[i];
//        arr[i] = pivot;
//        arr[high] = temp;
//        return i; // pivot index
//    }
//
//    public static void quickSort(int [] arr, int low, int high){
//        if(low < high){
//            int pidx = partition(arr, low, high);
//
//            quickSort(arr,low,pidx-1);
//            quickSort(arr,pidx+1,high);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int [] arr = {6,3,9,5,2,8};
//        int n = arr.length;
//        quickSort(arr, 0,n-1);
//
//        //print
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}
