package Top_Interview_150_Question_LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};
        int n = 3;
        int m = 3;

        //mergeArray(arr1, arr2, n, m);
        optCode(arr1,arr2,n,m);
        System.out.println(Arrays.toString(arr1));
    }

//----------------------------------------------<< Brute Force Approach >>----------------------------------------------------//
    public static void mergeArray(int arr1[], int arr2[], int n, int m) {
        int j = 0;  
        for (int i = n; i < arr1.length; i++) {
            arr1[i] = arr2[j];
            j++;
        }
        Arrays.sort(arr1);
    }

//----------------------------------------------<< Optimized Approach >>----------------------------------------------------//
 

    public static void optCode(int arr1[],int arr2[],int n,int m){
        int i=n-1;  //last index of arr1which is at teh end teh non index value 
        int j=m-1;  //last index of arr2 
        int k=m+n-1; //last index which is 0 the empty space 

        //ye condition is liye hai taki jb tka last index of arr1 ie non zero value  >=0 ho aur last index of arr2 >=0 ho tb tak y loop chale 
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
            arr1[k]=arr1[i];
            i--;
        }
        else{
            arr1[k]=arr2[j];
            j--;
        }
        k--;
        }
//agr phir bhi bach jae arr2 k andr tb 
        while(j>=0){
            arr1[k]=arr1[j];
            j--;
            k--;
        }
    }
}