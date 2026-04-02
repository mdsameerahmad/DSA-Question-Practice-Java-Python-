package Top_Interview_150_Question_LeetCode;

public class Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String args[]) {
        int arr[] = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        remove(arr);

    }

    public static void remove(int arr[]) {
        int count = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (i < 2 || arr[j] > arr[i - 2]) {
                arr[i] = arr[j];
                i++;
            }
        }
        System.out.print("The new Length of the array is : " + i);
    }
}