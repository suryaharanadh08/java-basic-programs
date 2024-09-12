import java.util.*;
class demoNullPointerException
{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int x;
        try
        {
            System.out.println(x);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}