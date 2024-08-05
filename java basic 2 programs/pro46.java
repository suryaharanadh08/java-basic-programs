class pro46
{
    public static void main(String[] args) {
        for(int i=1,j=0;i<=10;i++,j++)
        {
            if(i!=10)
            {
                System.out.print("1/"+Math.pow(2,j)+" + ");
            }
            else
            {
                System.out.print("1/"+Math.pow(2,j)+"");
            }
        }
        double sum=0;
        for(int i=1,j=0;i<=10;i++,j++)
        {
          sum=sum+(1.0/(Math.pow(2,j)));
        }
        System.out.println("\n"+sum);
    }
}