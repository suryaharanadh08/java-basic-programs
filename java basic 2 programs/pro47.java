class pro47
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i!=10)
            {
                System.out.print("1/"+i+"! + ");
            }
            else
            {
                System.out.print("1/"+i+"!");
            }
        }
        int tot=0;
        for(int i=1;i<=3;i++)
        {
            int sum=1;
            for(int j=i;j>=1;j--)
            {
                sum=sum*j;
            }
          tot=tot+sum;
        }
        System.out.println("\n"+tot);
    
    }
}