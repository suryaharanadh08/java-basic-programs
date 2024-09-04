

class A
{
    public int add(int a,int b)
    {
        return a+b;
    }
}

class B extends A
{
    public int sub(int a,int b)
    {
        return a-b;
    }
}


class singleLevelInheritance 
{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.add(10,40));
        System.out.println(obj.sub(10,40));

    }
}