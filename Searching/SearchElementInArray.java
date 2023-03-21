package Searching;

// SEARCH AN ELEMENT IN AN ARRAY (Unsorted)

import java.util.*;
import java.io.*;

class SearchElementInArray {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scan.nextInt(); // number of elements in the array
        
        System.out.print("Enter the array elements: ");
        int[] arr = new int[N]; // array
        for(int i=0 ; i<N ; i++) {
            arr[i] = scan.nextInt();
        }
                
        System.out.print("Enter the element to search: ");
        int X = scan.nextInt(); //element to search for
        
        System.out.println("ARRAY: " + Arrays.toString(arr));
        System.out.println("Result: " + SearchElementInArray.search(arr, N, X));

        scan.close();
    }

    public static int search(int arr[], int N, int X) {
        int res=-1; // if nothing is found

        for(int i=0 ; i<N ; i++) {
            if(arr[i] == X) {
                return i;
            }
        }

        return res;
    }
}
