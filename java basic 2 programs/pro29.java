class pro29{
    public static void main(String[] args) {
        int i=10,j=15;
        int x=(i>=j)?(i):(j);
        int gcd=0;
        for(int k=1;k<x;k++)
        {
            if(i%k==0 && j%k==0)
            {
                  gcd=k;
                  
            }
          
        }
        System.out.println("gcd is"+gcd);
    }
}