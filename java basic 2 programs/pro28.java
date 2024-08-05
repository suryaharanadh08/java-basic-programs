class pro29{
    public static void main(String[] args) {
        int i=4,j=6;
        int x=(i<=j)?(i):(j);
        for(int k=x;k<i*j;k++)
        {
            if(k%i==0 && k%j==0)
            {
                  System.out.println("lcm is"+k);
                  break;
            }
          
        }
        
    }
}