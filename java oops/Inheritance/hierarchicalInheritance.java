class A
{
    public int add(int i,int j)
    {
        return i+j;
    }
}
class B extends A
{
    public int sub(int i,int j)
    {
        return i-j;
    }
    
}
class C extends A
{
    public  int mul(int i,int j)
    {
        return i*j;
    }
}
class hierarchicalInheritance
{
    public static void main(String args[])
    {
        B obj1 = new B();
        System.out.println(obj1.add(100,200));
        System.out.println(obj1.sub(10,40));
        C obj2 = new C();
        System.out.println(obj2.add(100,200));
        System.out.println(obj2.mul(10,40));

    }
}