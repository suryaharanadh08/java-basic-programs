class surya extends Throwable
{

    surya(String s) {
        super(s);
    }
    
}
class UserDefinedException 
{
    public static void main(String[] args) throws surya
    {
      int age = 13;
      try
      {
            if(age>18)
            {
                 System.out.println("You are eligible");
            }
            else
            {
                 throw new surya("You are not eligible to vote >>");
            }    
      
      }
      catch(surya e)
      {
        System.out.println(e);
      }
    }
}