package Top_Interview_150_Question_LeetCode;

public class Majority_Element {

    public static void main(String args[]) {
        int arr[] = { 2, 1, 1, 1, 1, 2, 2 };
        majority(arr);

    }

    public static void majority(int arr[]) {
        int count = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                el = arr[i];
            }
            if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        System.out.print(el);

    }
}