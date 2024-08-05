import java.util.Scanner;
class pro27
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int n=scan.nextInt();
        int i=1;
        int count=0;
        while(count<=n)
        {
            int sum=0;
            count=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==i)
            {
                System.out.println(sum);
                count++;
            }
            i++;
            
        }
    }
}