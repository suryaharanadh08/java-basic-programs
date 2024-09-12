import java.util.*;
class demoNullPointerException
{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int arr[]=null;
        try
        {
           int temp = arr[0];
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}