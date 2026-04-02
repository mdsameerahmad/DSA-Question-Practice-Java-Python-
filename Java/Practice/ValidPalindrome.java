package Practice;

import java.util.Scanner;
    //valid palindrome function class 
public class ValidPalindrome {
    public boolean Valid(String s) {
      Scanner sc =new Scanner (System.in);
      System.out.print("Enter the String :");
      s = sc.nextLine();
      s=s.toLowerCase();  //converting to lower case
      s=s.replaceAll("[^a-z0-9]","");// removing all non alphanumeric characters
      sc.close();
      for(int i=0;i<s.length()/2;i++){
          if(s.charAt(i)!=s.charAt(s.length()-1-i)){
              return false;
          }
      }
     
      return true;
    }

    //main class
    public static void main(String args[]){
        ValidPalindrome obj=new ValidPalindrome(); //creating object of the class
        String s="";
        if(obj.Valid(s)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }
}
