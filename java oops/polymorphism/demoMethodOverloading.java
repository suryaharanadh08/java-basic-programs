class demoMethodOverloading
{

    static int add(int a,int b)
    {
        return a+b;
    }
    static float add(int a,float b)
    {
        return a+b;
    }
    static float add(float a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String args[])
    {
        System.out.println(add(1,2,3));
    }
}