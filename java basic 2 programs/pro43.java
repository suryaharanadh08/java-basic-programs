class pro43

{
    static int n=10;
    public static void main(String[] args) {
        for(int i=1;i<=n;i++)
        {
            if(i!=10)
            {
                System.out.print("1/"+i+" + ");
            }
            else
            {
                System.out.print("1/"+i+"  ");
            }
            
        }
        double x,sum=0;
        for(int i=1;i<=n;i++)
        {
            x=1.0/i;
            //System.out.println(x);
            sum=sum+x;
        }
        System.out.println(sum);
    }
}