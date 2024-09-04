class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();    
        int k=0,x=0,findex=0,lindex=0,count,big=0;
        String str="";
        for(int i=0;i<ch1.length;i++)
        {
            for(int j=0;j<ch2.length;j++)
            {
                count=0;
                if(ch1[i]==ch2[j])
                {
                    x=i;
                    for(k=i;k<ch1.length && j<ch2.length;k++)
                    {
                        if(ch1[k]==ch2[j])
                        {
                            //System.out.println(ch1[k]+" "+ch2[j]+" ");
                            count++;
                            j++;
                        }
                        else
                        {
                            break;
                        }
                    }
                     
                }
                 
                if(count>=big)
                {
                    findex=x;
                    lindex=x+count-1;
                    big=count;
                }
                //System.out.println(big);

            }
        }
        
        for(int i=findex;i<=lindex;i++)
        {
            str=str+str1.charAt(i);
        }
        System.out.println(str);
        return str;
    }
    public static void main(String[] args) {
        gcdOfStrings("LEET","CODE");

    }
}