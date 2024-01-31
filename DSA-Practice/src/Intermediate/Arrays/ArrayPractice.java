package Intermediate.Arrays;

public class ArrayPractice {
    /*
        Count elements greater than other element
            // 8 8 8 8 8
            // -3 -2, 6 8 4 8 5
     */
    public static int countGreater(int arr[]){
        int maxElement = Integer.MIN_VALUE;
        int count = 0;
        for(int i : arr){
            if(i >= maxElement)
                maxElement = i;
        }

        for (int i : arr){
            if(maxElement == i)
                count++;
        }
        return arr.length - count;
    }

//    Given an integer array A check if there exist
//    a pair of index i,j s.t A[i] + A[j] = K

    public static int checkPair(int[] arr, int k){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j < n; j++){
                    if (arr[i] + arr[j] == k) count++;
            }
        }
        return count; // O(n^2) - TC // O(1) - SC
    }

    public static int[] reverseArray(int[] arr){
        // -1, 4, 5, 6
        // we can swap
        int n = arr.length;
        swap(arr, 0, n-1);
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {-3, -2, 6, 8, 4, 8, 5};
        System.out.println(countGreater(arr));

        int ans[] = reverseArray(arr);
        for(int i : ans){
            System.out.print(i + " ");
        }

    }


}
