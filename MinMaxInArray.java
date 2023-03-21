// FIND MINIMUM AND MAXIMUM ELEMENT IN AN ARRAY

import java.util.Arrays;
import java.util.Scanner;

class MinMaxPair {
    long min, max;

    public MinMaxPair(long Min, long Max)  
    {  
        this.min = Min;  
        this.max = Max;  
    }
}

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        long N = scan.nextLong(); // number of elements in the array

        System.out.print("Enter the array elements: ");
        long[] arr = new long[(int) N]; // array
        for(long i=0 ; i<N ; i++) {
            arr[(int) i] = scan.nextLong();
        }

        System.out.println("ARRAY: " + Arrays.toString(arr));
        System.out.println("Result Min: " + MinMaxInArray.getMinMax(arr, N).min);
        System.out.println("Result Max: " + MinMaxInArray.getMinMax(arr, N).max);
        
        scan.close();
    }

    public static MinMaxPair getMinMax(long arr[], long n) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for (long e : arr) {
            if(min > e){
                min = e;
            }
            if(max < e){
                max = e;
            }
        }

        return new MinMaxPair(min, max);
    }

}
