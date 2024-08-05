class pro22
{
    public static void main(String[] args) {
        int num =20764;
        int count=1;
        int even=0,odd=0;
        while(num>0)
        {
            int rem=num%10;
            if(count%2!=0)
            {
                even = even+rem;
                //System.out.println(even);
            }
            else
            {
                odd=rem+odd;
            }
            count++;
            num=num/10;
        }
        System.out.println("sum of even nums is : "+even);
        System.out.println("sum of odd nums is : "+odd);
    }
}