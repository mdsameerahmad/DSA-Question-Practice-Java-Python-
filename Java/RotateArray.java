package Java;

import java.util.Scanner;

public class RotateArray {

    public static void ReverseArray(int array[], int start, int end) {
        while (end > start) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array:");
        int n = sc.nextInt();

        int NewArray[] = new int[n];

        System.out.println("Enter each element of the array:");
        for (int i = 0; i < n; i++) {
            NewArray[i] = sc.nextInt();
        }

        System.out.println("Enter number of rotations k:");
        int k = sc.nextInt();

        k = k % n; // handle k > n

        // Rotate using reversal algorithm
        ReverseArray(NewArray, 0, n - 1);
        ReverseArray(NewArray, 0, k - 1);
        ReverseArray(NewArray, k, n - 1);

        // Print rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(NewArray[i] + " ");
        }
    }
}
