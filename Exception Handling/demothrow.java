class demothrow
{
    static void vote(int age)
    {
        if(age>18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            try
            {
                throw new IllegalArgumentException("You are not eligible to vote");
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e);
            }
        }
        
    }
    public static void main(String[] args) {
        vote(11);
    }
}