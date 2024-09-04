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
class multiLevelInheritance extends B
{
    public static void main(String args[])
    {
        B obj = new B();
        System.out.println(obj.add(10,20));
        System.out.println(obj.sub(100,50));
    }
}