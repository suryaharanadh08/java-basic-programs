import java .util.*;

class pro37
{
    public static void main(String[] args) {
        String arr[]={"1","1","2","3","2","6","6"};
        int len=arr.length;
        String arr2[]=new String[len];
        for(int i=len-1,j=0;i>=0;i--,j++)
            {
               
                arr2[j]=arr[i];
                
                
            }
        System.out.println(Arrays.toString(arr2));
    }
}