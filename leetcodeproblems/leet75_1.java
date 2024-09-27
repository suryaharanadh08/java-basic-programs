class Solution {
    public static String mergeAlternately(String word1, String word2) 
    {
        String arr[]=word1.split("");
        String brr[]=word2.split("");
        int len1=arr.length;
        int len2=brr.length;
        String res="";
        System.out.println(len1+" "+len2);
        String s[]=new String[(len1+len2)];
        int x=0,y=0,z=0;
        for(int i=0;i<(len1+len2);i++)
        {
            if(i<=len1-1)
            { 
               for(int j=i;j==i;j++)
                {
                    System.out.println("23");
                   s[z]=arr[x];
                   x++;
                   z++;
                }
            }  
            if(i<=len2-1)
            {                
              for(int k=i;k==i;k++)
                {
                    System.out.println("re");
                    s[z]=brr[y];
                    y++;
                    z++;
                }
            }       
        }       
        for(String m:s)
        {
            res=res+m;
        }
        return res;
    }
    public static void main(String args[])
    {
       String res= mergeAlternately("su","kalki");
        System.out.println(res);
    }
}