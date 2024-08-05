class pro45
{
    public static void main(String[] args) {
        for(int i=1,j=0;i<=10;i++,j++)
        {
            if(i!=10)
            {
                System.out.print("1/"+Math.pow(i,j)+" + ");
            }
            else
            {
                System.out.print("1/"+Math.pow(i,j)+"");
            }
        }
        double sum=0;
        for(int i=1,j=0;i<=10;i++,j++)
        {
          sum=sum+(1.0/(Math.pow(i,j)));
        }
        System.out.println("\n"+sum);
    }
}