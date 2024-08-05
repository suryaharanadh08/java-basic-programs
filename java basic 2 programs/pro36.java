import java .util.*;

class pro36
{
    public static void main(String[] args) {
        String arr[]={"1","1","2","3","2","6","6"};
        int len=arr.length;
        String arr2[]=new String[len];
        int k=0;

        for(int i=0;i<len;i++)
            {
                for(int j=i+1;j<len;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        arr2[k]=arr[j];
                        k++;
                    }

                }
                
            }
        System.out.println(Arrays.toString(arr2));
    }
}