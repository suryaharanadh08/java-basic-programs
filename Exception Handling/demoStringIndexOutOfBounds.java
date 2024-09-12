class demoStringIndexOutOfBounds extends Throwable
{
    public static void main(String[] args) 
    {
        try
        {
            String s = "surya";    
            char temp=s.charAt(6);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}