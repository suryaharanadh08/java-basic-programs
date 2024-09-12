class MyOwnException extends Throwable
{

    MyOwnException(String s) {
        super(s);
    }
    
}
class UserDefinedException
{
    public static void main(String[] args) throws MyOwnException
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
                 throw new MyOwnException("You are not eligible to vote >>");
            }    
      
      }
      catch(MyOwnException e)
      {
        System.out.println(e);
      }
      System.out.println("surya");
    }
}