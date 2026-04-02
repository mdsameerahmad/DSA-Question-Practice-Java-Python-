package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public static int Missing(int arr[]) {
        Arrays.sort(arr);
        int missing = 1; // it start from (1-n) ---- if it star from 0 we will take 0-n
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != missing) {
                return missing;
            }
            missing++;
        }
        return missing;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the  Array :-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Integers of the array :-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int missingNumberIs = Missing(arr);
        System.out.println("Missing Number is :- " + missingNumberIs);

    }

}