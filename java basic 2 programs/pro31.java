class pro31{
    public static void main(String[] args) {
        
        
       int rem;
       
       for(int num=1;num<=1000;num++)
        {
            int a=num;
            int sum=0;
            while(num>0)
             {
                rem = num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
             }
             num=a;
             if(sum==a){
            System.out.println(sum+" is an Armstrong number");
        }

        }
        
        
      
        
    }
}