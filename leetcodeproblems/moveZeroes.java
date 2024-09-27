class Solution {
    public static void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int zeroesCount=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeroesCount++;
            }
        }
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=0)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        for(int j=1;j<=zeroesCount;j++)
        {
            arr[k]=0;
            k++;
        }
        for( int i: arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={0,1,3,0,34,546,0,0,2};
        moveZeroes(arr);
    }
}