import java.util.Scanner;
class pro8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num 'n' to print 'n' even nums :  ");
        int n = scan.nextInt();
        for(int i= 1; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
       }
    }
}