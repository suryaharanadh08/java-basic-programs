class A
{
    public static int add(int a,int b)
    {
        return a+b;
    }
}


class demoInheritance extends A
{
    public static void main(String[] args) {
        System.out.println(add(10,20));
    }
}