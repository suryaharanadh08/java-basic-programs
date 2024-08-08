/**Program to implement user-defined function to compare two strings. */


import java.util.Scanner;
class pro7
{


    static void strcompare(String s1,String s2)
    {
        int flag =1;
        if(s1.length()!=s2.length())
        {
            System.out.println("Strings are not same");
            
        }
        else if(s1.length()==s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    System.out.println("Strings are not same");
                    flag=0;
                    break;
                }
                     
            }
            if(flag==1)
            {
                System.out.println("Strings are same");
            }
        }
        
        
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter string 1 :");
       String s1 = scan.nextLine();
       System.out.println("Enter string 2 :");
       String s2 = scan.nextLine();
       strcompare(s1,s2);
    }
}