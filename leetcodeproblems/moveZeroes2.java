class Solution {
    public static void moveZeroes(int[] nums) {
        int temp;      
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==0 && nums[i+1]!=0)
            {
               temp=nums[i];
               nums[i]=nums[i+1];
               nums[i+1]=temp;
              // System.out.print(temp+" "+nums[i]+" "+nums[i+1]);
            }
            
        }
        for(int i: nums)
        {
            System.out.println(i);
        }
       
    }
    public static void main(String args[])
    {
        int arr[]={0,1,0,1,6};
        moveZeroes(arr);
    }
}