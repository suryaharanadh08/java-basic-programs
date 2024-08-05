class pro44and48
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i!=10)
            {
                System.out.print("1/"+(i*i)+" + ");
            }
            else
            {
                System.out.print("1/"+(i*i)+"");
            }
        }
        double sum=0;
        for(int i=1;i<=10;i++)
        {
          sum=sum+(1.0/(Math.pow(i, 2)));
        }
        System.out.println("\n"+sum);
    }
}