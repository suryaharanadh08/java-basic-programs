class DemoTryCatch
{
    public static void main(String[] args) {
        
        try
        {
            int a=56/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            System.out.println("finally block always executes..");
        }
    }
    
}