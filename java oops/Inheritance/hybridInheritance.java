class India
{
    public void States()
    {
        System.out.println("There are total 28 states in India");
    }
}
class Maharashtra extends India
{
    public void mumbai()
    {
        System.out.println("mumbai is the captil of maharashtra");
    }
}
class Karnataka extends India
{
    public void Bangalore()
    {
        System.out.println("Bangalore is the captil of Karnataka");
    }
}
class MysorePalace extends Karnataka
{
    public void palace()
    {
        System.out.println("Mysore palace is in karnataka");
    }
}
class hybridInheritance{
    public static void main(String[] args) {
        Maharashtra obj1 = new Maharashtra();
        obj1.States();
        obj1.mumbai();
        Karnataka obj2 = new Karnataka();
        obj2.States();
        obj2.Bangalore();
        MysorePalace obj3 = new MysorePalace();
        obj3.Bangalore();
        obj3.palace();
    }
}