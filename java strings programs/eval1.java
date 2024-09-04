
import java.util.StringTokenizer;

class eval1
{
    static void pro1()
    {
            StringTokenizer s= new StringTokenizer("miracle software systems");
        while(s.hasMoreElements())
        {
            String temp=s.nextToken();
            int len=temp.length();
            for(int i=len-1;i>=0;i--)
            {
                System.out.print(temp.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    static void pro2()
    {
        int arr[]={6,34,56,26};
        for(int i=0;i<=arr.length-1;i++)
        {
            int temp=0;
            for(int j=1;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    temp=temp+j;
                }
            }
            if(temp==arr[i])
            {
                System.out.println(temp+" is perfect num");
            }
        }
        System.out.println("\n");

    }
    static void pro3()
    {
        int x=1;
        for(int i=1;i<=5;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println("");
        }
    }
    static void pro4()
    {
        double tot=0;
        for(int i=1;i<=4;i++)
        {
            int fact=1;
            for(int j=i;j>=1;j--)
            {
                fact =fact*j;
            }
            double temp=1/Math.pow(i,fact);
            tot=tot+temp;
        }
        System.out.println(tot);
    }
    public static void main(String[] args) {
        pro1();
        pro2();
        pro3();
        pro4();
    }
}