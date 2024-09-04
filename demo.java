class demo
{
    public static void main(String[] args) {
        for(int i=1;i<=17;i++)
        {
            for(int j=1;j<=17;j++)
            {
                if(i==1 && j<8)
                {
                    System.out.print("*");
                }
                if(i==9 && j<=17)
                {
                    System.out.print("*");
                }
                if((i==17 && (j>=1 && j<8)))
                {
                    System.out.print(" ");
                }
                 if(i==17 && j>=8)
                {
                     System.out.print("*");
                } 
                if((i>1 && i<9)&& j<8)
                {
                    System.out.print(" ");
                }
                 if((i>9 && i<17) && j<8)
                {
                    System.out.print(" ");
                }
                if(j==8)
                {
                    System.out.print("*");
                }
              
            }
            System.out.println("");
        }
    }
}