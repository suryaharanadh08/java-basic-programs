import java.util.Scanner;
class pro1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Num :");
        int num = scan.nextInt();
        if(num<0){
            System.out.println("you entered a NEGATIVE number");
        }
        else 
            System.out.println("you entered a POSITIVE number");
    }
}