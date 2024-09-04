class Solution {
    public static String longestCommonPrefix(String[] strs) 
    {
        String res="";
        
        if(strs.length==1)
        {
            res=strs[0];
            return res;
        }
        else
        {
            int ans=0;
        int arr[]=new int[strs.length-1];
        int count=0;
        for(int i=0;i<strs.length-1;i++)
        {
            count=0;
            String s1=strs[i];
            String s2=strs[i+1];
            int len1=s1.length();
            int len2=s2.length();
            int len3;
            if(len1<=len2)
                len3=len1;
            else
                len3=len2;
            for(int j=0;j<len3;j++)
            {
                if(s1.charAt(j)==s2.charAt(j))
                {
                    count++;
                }
                else
                    break;
            }
            arr[i]=count;
        }
        int small=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            
            if(arr[i+1]<small)
            {
                small=arr[i+1];
            }
        }
        String temp=strs[0];
        for(int i=0;i<small;i++)
        {
            res=res+temp.charAt(i);
        }
        //System.out.println(small);
        return res;
        }
    }
    public static void main(String args[])
    {
        String strs[]={"a"};
        //System.out.println(strs.length);
       System.out.println(longestCommonPrefix(strs));
    }
}