package Practice;

import java.util.*;

public class RemoveDuplicate {

    // function to remove duplicates from sorted array
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;  // length of unique elements
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sorted array elements : ");
        String line = sc.nextLine(); 
        String[] parts = line.split("");

        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]); 
        }

        RemoveDuplicate obj = new RemoveDuplicate();
        int newLength = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements = " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
