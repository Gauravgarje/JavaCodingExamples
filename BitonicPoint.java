// GIVEN AARRAY OF N ELEMENTS THAT IS FIRST STRICTLY INCREASING THEN MAYBE STRICTLY DECREASING, FIND THE MAX ELEMENT IN ARRAY. IF ARRAY IS INCREASING THEN PRINT LAST ELEMENT.
// EX: Enter the number of elements: 9
// Enter the array elements: 1 15 25 45 42 21 17 12 11
// ARRAY: [1, 15, 25, 45, 42, 21, 17, 12, 11]
// Maximum element is: 45

import java.util.Arrays;
import java.util.Scanner;

public class BitonicPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scan.nextInt(); // number of elements in the array

        System.out.print("Enter the array elements: ");
        int[] arr = new int[(int) N]; // array
        for(int i=0 ; i<N ; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("ARRAY: " + Arrays.toString(arr));

        System.out.println("Maximum element is: " + BitonicPoint.findMaximum(arr, N));
        
        scan.close();
    }

    public static int findMaximum(int[] arr, int n) {
        int max = -1;

        if(n == 1){
            // if only one element in array
            max = arr[0];
        } else if(arr[n-2] < arr[n-1]){
            // array is strictly increasing return last element
            max = arr[n-1];
        } else{
            for(int i=0 ; i<n-1 ; i++) {
                if(arr[i] > arr[i+1]){
                    return arr[i];
                }
            }
        }

        return max;
    }
    
}
