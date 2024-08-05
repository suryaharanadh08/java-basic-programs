class palindrome
{
    public static void main(String[] args) {
        
        int num=1981;
        int newnum =num;
        int temp=0;
        while(num>0)
        {
            int rem=num%10;
            temp =rem+(temp*10);
            num=num/10;

        }
        if(newnum==temp)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
       
    }
}