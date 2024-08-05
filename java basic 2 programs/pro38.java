import java .util.*;

class pro37
{
    public static void main(String[] args) {
    
    int num[]={34,45,23,74,43,454};
    int big=0;
    for(int i=0;i<num.length;i++)
    {
        if(num[i]>big)
        {
            big=num[i];
        }
    }
    System.out.println("the biggest num is : "+big);
        
    }
}