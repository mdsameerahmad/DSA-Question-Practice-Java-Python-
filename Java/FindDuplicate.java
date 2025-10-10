package Java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicate {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        int slow = arr.get(0);
        int fast = arr.get(0);

        do {
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        } while (slow != fast);

        fast = arr.get(0);
        while (slow != fast) {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }

        return slow;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println(findDuplicate(arr, n));
        }
        sc.close();
    }
}
