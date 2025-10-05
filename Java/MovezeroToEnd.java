package Java;

public class MovezeroToEnd {

    public static void main(String args[]) {
        int arr[] = { 2, 2, 3, 1, 0, 3, 0, 9 };
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }
        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}