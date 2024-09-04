interface A
{
    void car();
}
interface B
{
    void bike();
}
class C implements A,B
{
    public void bike()
    {
        System.out.println("bike is a two wheeler...");
    }
    public void car()
    {
        System.out.println("car is a four wheeler...");
    }
}
class multipleInheritance
{
    public static void main(String[] args) {
        C obj = new C();
        obj.bike();
        obj.car();
    }
}