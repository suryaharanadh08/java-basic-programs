abstract class athelete
{
    abstract void run();
    void fit()
    {
        System.out.println("I am unfit");
    }
    void game()
    {
        System.out.println("I play cricket");
    }
}
class virat extends athelete{
    void run()
    {
        System.out.println("I am virat..");
    }
    @Override
    void fit()
    {
        System.out.println("I am fit");
    }

}
class demoAbstractClass
{
    public static void main(String args[])
    {
        athelete obj = new virat();
        obj.fit();
        obj.run();
        obj.game();
    }
}