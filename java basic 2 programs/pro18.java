class pro18{
    public static void main(String[] args) {
        
        int num=46785;
        int sum=0;
         int count =1;
        int revnum=0;
        while(num>0)
        {
           
            int rem=num%10;
            revnum=Integer.parseInt(Integer.toString(revnum)+Integer.toString(rem));

            num=num/10;
        }
        System.out.println(revnum);
        while(revnum>0)
        {
            int rem=revnum%10;
             if(count%2!=0)
            {
                sum=sum+rem;
            }
            count++;
            revnum=revnum/10;
        }
        System.out.println(sum);
        
    }
}