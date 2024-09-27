class demothrows
{
    static void myfun() throws ArithmeticException
    {
        int c=13/0;
    }
    public static void main(String[] args) {
        try
        {
           myfun();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
    }
}