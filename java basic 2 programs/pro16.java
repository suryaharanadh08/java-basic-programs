class pro16{
    public static void main(String[] args) {
        int num = 458703;
        int big=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem>=big)
            {
                big=rem;
            }
            num=num/10;
        }
         System.out.println(big);
    }
}