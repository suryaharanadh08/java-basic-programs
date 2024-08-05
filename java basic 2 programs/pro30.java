class pro30{
    public static void main(String[] args) {
        int num=153;
        int a=num;
        int rem;
       int sum=0;
        while(num>0)
        {
            rem = num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        
        if(sum==a){
            System.out.println(sum+" is an Armstrong number");
        }
        else{
            System.out.println(sum+" is Not a armstrong num");
        }
      
        
    }
}