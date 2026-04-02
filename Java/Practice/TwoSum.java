package Practice;


//two sum were input is sorted using two pinters approach
//taking indices starting from 1

public class TwoSum {
    public static void main(String args[]){
         int [] arr={2,7,11,15};
        int[] result=new int[2];
       
        int target=9;
        int left=0;
        int right = arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                result[0]=left+1;
                result[1]=right+1;
               break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(result[0]+" "+result[1]);
    }
    
}
