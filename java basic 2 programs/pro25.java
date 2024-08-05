import java.util.Scanner;
class primenum
{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a num");
        int n=scan.nextInt();
        for(int i =2;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0){
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
            
        }
    }
}