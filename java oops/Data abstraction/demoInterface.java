interface war
{
  void weapons();
}
interface peace extends war
{
    void spreadLove();
}
class india implements peace
{
    @Override
    public void weapons()
    {
        System.out.println("I sell weapons..");
    }
    @Override
    public void spreadLove()
    {
        System.out.println("Live peacefully..");
    }
}
class demoInterface
{
    public static void main(String[] args) {
        india obj = new india();
        obj.weapons();
        obj.spreadLove();
    }
}