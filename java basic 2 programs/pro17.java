class pro17{

    static int rec(int num,int sum)
    {
        
        while(num>0)
        {
          
            int rem=num%10;
            sum=sum+rem;
            
            num=num/10;
            if(num>0)
            {
                return rec(num,sum);
            }
            else 
            {
                System.out.println("sum is "+sum);
                
            }
        }return 0;

    }
    public static void main(String args[]){
        rec(1234,0);
    }
}