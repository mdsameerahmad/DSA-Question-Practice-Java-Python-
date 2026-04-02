package Practice;

import java.util.Scanner;

public class ContainerWithMostWater{


    public static int  FinalArea(int [] height){
         int left=0;
        int right=height.length-1;
        int maxArea=0;
        

        while(left<right ){
            int currArea=Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(currArea,maxArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
         }
         return maxArea;
    }

    public static void   main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the  array : ");
         int n=sc.nextInt();
         int [] height=new int[n];  
         System.out.println("Enter the array elemnt :");
         for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
         }
           int result = FinalArea(height);
           System.out.println("Total Maximum area is :"+ result);
         sc.close();
    }
}