package Java;

public class PalindromNumber {
    public static void main(String args[]) {
        long num = -121;
        long dup = num;
        num = Math.abs(num); // --------- Handle negative numbers(kind of ignore the negative
                             // sign)--------------///
        long revNum = 0;
        while (num > 0) {
            long lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num = num / 10;
        }
        if (Math.abs(dup) == revNum) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

    }
}
