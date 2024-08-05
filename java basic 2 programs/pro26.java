import java.util.Scanner;
class pro26
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num M :");
        int m= scan.nextInt();
        System.out.println("Enter a num N :");
        int n= scan.nextInt ();
        
        for(int i=m;i<n;i++)
        {
            int sum =0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
            {
                System.out.println(i+" is a perfect num");
            }
        }
    }
}