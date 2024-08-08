/*Program to print string
a.in alphabetical order
b.in reverse alphabetical order */
import java.util.Arrays;
class pro9
{
    public static void main(String[] args) 
    {
        String word = "surya";
        char[] array=word.toCharArray();
        Arrays.sort(array);        
        System.out.println("String in Alphabetical order :");
        for(char c: array)
        {
            System.out.print(c);
        }
        System.out.println("\nString in Descending order");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i]);
        }
        System.out.println("\n");
    }
}