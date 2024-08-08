/*Program to convert the first letter of each word into uppercase in a given
string. */

class pro6
{
    public static void main(String[] args) {
        String word = "welcome to my world";
        String[] arr=word.split(" ");
        String A,B,C="";
        for(String s: arr)
        {
            A=Character.toString(s.charAt(0)); //Access the first character in a string s
            A=A.toUpperCase();  //converts s to uppercase

            // System.out.print(A);
            B=s.substring(1); //Access the remaining characters of a string s
           // System.out.print(B);
            C=C+A+B+" ";
            
        }
        System.out.println(C);
        
       
    }
}