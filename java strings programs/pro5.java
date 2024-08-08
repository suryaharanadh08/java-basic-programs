
/*Program to delete given character from given string*/

import  java.util.Scanner;

class pro5
{
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a string :");
      String word =scan.nextLine();
      System.out.println("Enter the character to delete in that :");
      String s=scan.nextLine();
      char z=s.charAt(0);
      for(int i=0;i<word.length();i++)
      {
        if(word.charAt(i)==z)
        {
            word=word.replace(z,' ');
        }
      }
      word=word.replace(" ","");
      System.out.println("Replaced string is "+word);
  }
}