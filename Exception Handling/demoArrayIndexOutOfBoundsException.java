class demoArithmeticException
{
    public static void main(String[] args) {
        try
        {
            String arr[]=new String[3];
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);

        }        
    }
}