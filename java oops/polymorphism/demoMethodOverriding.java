class Game
{
    public void cricket()
    {
        System.out.println("I will bat first...");
    }
}
class play extends Game
{
    public void cricket()
    {
        System.out.println("I will bowl first...");
    }
}
class sport extends play
{
    public void cricket()
    {
        System.out.println("Match stopped due to rain...");
    }
}


class demoMethodOverriding
{
    public static void main(String[] args)
    {
        Game obj= new sport();
        obj.cricket();    
    }
}