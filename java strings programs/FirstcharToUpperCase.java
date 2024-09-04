import java.util.*;
//import java.lang.*;

class FirstcharToUpperCase
{
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("surya hara nadh");
        while(s.hasMoreTokens())
        {
            String temp=s.nextToken();
            char temp2 =Character.toUpperCase(temp.charAt(0));
            String temp3 = String.valueOf(temp2)+temp.substring(1);
            System.out.println(temp3);
        }   
    }
}