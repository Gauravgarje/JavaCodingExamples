// GIVEN AN ARRAY OF SIZE N AND INTEGER K, FIND MAX FOR EACH AND EVERY CONTIGUOUS SUBARRAY OF SIZE K
// EX: Enter the number of elements in array (N): 9
// Enter the number of elements in subarray (K): 3
// Enter the array elements: 1 2 3 1 4 5 2 3 6
// ARRAY: [1, 2, 3, 1, 4, 5, 2, 3, 6]
// Max of Sub Arrays: [3, 3, 4, 5, 5, 5, 6]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxOfAllSubArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements in array (N): ");
        int N = scan.nextInt(); // number of elements in the array

        System.out.print("Enter the number of elements in subarray (K): ");
        int K = scan.nextInt(); // number of elements in the subarray

        System.out.print("Enter the array elements: ");
        int[] arr = new int[N]; // array
        for(int i=0 ; i<N ; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("ARRAY: " + Arrays.toString(arr));

        System.out.println("Max of Sub Arrays: " + max_of_subarrays(arr, N, K));
        
        scan.close();
    }

    public static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int newN = n - k + 1;

        for(int i=0 ; i<newN ; i++){
            int subArrayMax = Integer.MIN_VALUE;
            for(int m=i ; m<(i+k) ; m++){
                if(subArrayMax < arr[m])
                    subArrayMax = arr[m];
            }
            
            arrayList.add(subArrayMax);
        }

        return arrayList;
    }
    
}
