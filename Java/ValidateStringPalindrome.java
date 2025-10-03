package Java;

import java.util.Scanner;

public class ValidateStringPalindrome {
    public boolean Valid(String s) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        s=sc.nextLine();
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int n= s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!= s.charAt(n-1-i)){
                return false;
            }
        }
         sc.close();
        return true;
       
    }
}
