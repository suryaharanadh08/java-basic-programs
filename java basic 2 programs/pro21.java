

class pro21{
    public static void main(String[] args) {
        int num=3464;
        int rem,sum=0;
        int count=1;
        int length=(Integer.toString(num)).length();
        //System.out.println(length);
        while(num>0)
        {
            rem=num%10;
            num=num/10;    
            //System.out.println(rem);
            if(count==1 || count==length)
            {
                sum=sum+rem;
                
            }
            count++;
        }
        System.out.println(sum);
    }
}