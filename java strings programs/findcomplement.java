class Solution {
    public static long findComplement(int num) {
        int rem,dividend=num;
        String binary="";
        String complement="";
        long ans=0L;
        
        long arr[]={1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 
            4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 
            1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 
            67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 
            2147483648L
};
        if(num==1)
            return 0;
        else
         {
            while(dividend>1 || num==1)
            {
                 rem=dividend%2;
                 dividend=dividend/2;
                 binary=binary+String.valueOf(rem); 
                 num=0;        
            }
         binary=binary+String.valueOf(dividend);
        
      
         for(int i=0;i<=binary.length()-1;i++)
            {
                if(binary.charAt(i)=='0')
                    complement=complement+"1";
                else
                   complement=complement+"0";
            }
            for(int j=0;j<complement.length();j++)
            {
                if(complement.charAt(j)=='1')
                {
                    ans=ans+arr[j];
                }
            }
          //System.out.println(complement+"  "+binary);
          return ans;
         }
       
        
    }
    
    public static void main(String args[])
    {
        System.out.println(findComplement(1111));
    }
}