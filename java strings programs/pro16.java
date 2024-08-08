
/*Program to replace a substring inside a string by another one */
class pro16
{
   public static void main(String[] args) {
       String s = "Program";
       String repl = "ram";
       String text = "jam";
       String solution = s.replace(repl,text);
       System.out.println("The replaced one is : "+solution);
   }
}