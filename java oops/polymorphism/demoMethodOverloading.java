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
     int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String args[])
    {
        demoMethodOverloading obj = new demoMethodOverloading();
        System.out.println(obj.add(1.8f,3));
    }
}