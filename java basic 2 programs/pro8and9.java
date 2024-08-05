import java.util.Scanner;
class pro8and9{

    static void PrintEvenNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num 'n' to print 'n' even nums :  ");
        int n = scan.nextInt();
        int x=1;
        int i=1;
        while(x<=n){
            if(i%2==0){
                System.out.println(i);
                x++;
            }
            i=i+1;
       }
    }

    static void SumOfEvenNums(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num 'n' to print the sum of'n' even nums :  ");
        int n = scan.nextInt();
        int sum=0;
        int i=1;
        int x =1;
        while(x<=n){
            if(i%2==0){
                sum=sum+i;
                x++;
            }
            i++;
        }   System.out.println("The sum is "+sum);
            
    }

    public static void main(String[] args) {
        PrintEvenNum();
        SumOfEvenNums();
    }
}