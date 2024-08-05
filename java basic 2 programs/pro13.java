class pro13{
    static void fac(int n)
    {
        int f=1;
        for(int i =n;i>=1;i--)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is "+f);

    }
    
    public static void main(String[] args) {

        fac(5);
    }
}