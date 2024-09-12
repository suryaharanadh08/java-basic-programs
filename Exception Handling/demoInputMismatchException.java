import java.util.*;
class demoInputMismatchException
{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
         System.out.println("Enter a num : ");
        try
        {
            int s = scan.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}