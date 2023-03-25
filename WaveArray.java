// CONVERT A SORTED ARRAY TO WAVE ARRAY WHERE ARR[0] >= ARR[1] <= ARR[2] ...
// EX01: Enter the number of elements: 5
// Enter the array elements: 1 2 3 4 5
// ARRAY: [1, 2, 3, 4, 5]
// Wave Array: [2, 1, 4, 3, 5]
// EX02: Enter the number of elements: 6
// Enter the array elements: 2 4 7 8  9 10
// ARRAY: [2, 4, 7, 8, 9, 10]
// Wave Array: [4, 2, 8, 7, 10, 9]

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray{
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

        System.out.println("Wave Array: " + Arrays.toString(WaveArray.convertToWave(N, arr)));
        
        scan.close();
    }

    public static int[] convertToWave(int n, int[] a) {

        if(n%2 != 0){
            // if array element count is odd
            n = n-1;
        }

        for(int i=0; i<n ; i=i+2){
            // Swap the array elements
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }

        return a;
    }
}