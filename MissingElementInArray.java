// FIND THE MISSING ELEMENT IN THE GIVEN ARRAY (having distinct elements frm 1 to N with one missing element)

import java.util.Arrays;
import java.util.Scanner;

public class MissingElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] arr;
        try {
            System.out.print("Enter the array elements: ");
            arr = new int[N-1]; // array will be N-1 bcz of missing element
            for(int i=0 ; i<(N-1) ; i++) {
                arr[i] = scan.nextInt();
            }
        } catch (NegativeArraySizeException nase) {
            System.out.println("INVALID NUMBER... NEGATIVE ARRAY SIZE!!!");
            scan.close();
            return;
        } catch (Exception e) {
            System.out.println("INVALID OR NO VALUES ENTERED IN THE ARRAY!!!");
            scan.close();
            return;
        } 

        System.out.println("ARRAY: " + Arrays.toString(arr));
        System.out.println("Missing Element: " + MissingElementInArray.missingNumber(arr, N));

        scan.close();
    }

    public static int missingNumber(int array[], int n) {        
        int originalSum = ( n * (n+1) )/2 ;
        int currentSum = 0;

        for (int i : array) {
            currentSum += i;
        }

        return (originalSum - currentSum);
    }
}
