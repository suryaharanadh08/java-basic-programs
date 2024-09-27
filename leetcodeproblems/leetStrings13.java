

class Solution {
    static public int romanToInt(String input) {
        
        String s=input.toUpperCase();
        int sum=0;
        char arr1[]={'I','V','X','L','C','D','M'};
        int arr2[]={0,1,2,3,4,5,6};
        int arr3[]={1,5,10,50,100,500,1000};
        int index1=0,index2=0,index3=0;
        int len=s.length()-2;
        char ch2;
        
        for(int i=0;i<s.length();i++)
        {
           char ch1=s.charAt(i);
           for(int j=0;j<arr1.length;j++)
           {
                if(arr1[j]==ch1)
                {
                    index1=j;
                   // System.out.println(index1);
                    break;
                }
           }
           
        
           try 
           {
             ch2=s.charAt(i+1);
             for(int j=0;j<arr1.length;j++)
           {
                if(arr1[j]==ch2)
                {
                    index2=j;
                   // System.out.println(index2);
                    break;
                }
           }
               
           } catch (Exception e) {
             sum=sum+arr3[index1];
             break;
           }
           
           

           
           

            if(index1>=index2)
            {
               switch (s.charAt(i)) {
                   case 'I':
                       sum=sum+1;
                       break;
                   case 'V':
                       sum=sum+5;
                       break;
                   case 'X':
                       sum=sum+10;
                       break;
                   case 'L':
                       sum=sum+50;
                       break;
                   case 'C':
                       sum=sum+100;
                       
                       break;
                   case 'D':
                       sum=sum+500;
                       break;
                   case 'M':
                       sum=sum+1000;
                       break;
               }
                            
            }
            else
                {
                    sum=sum+arr3[index2]-arr3[index1];
                    i++;
                    
                }  
                //System.out.println(sum);
            
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(romanToInt("mcmxciv"));
    }
}