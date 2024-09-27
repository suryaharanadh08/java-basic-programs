class SumOfFirstTenPerfectNum
{
    public static void main(String[] args) {
        int sum = 0;
        int temp;
        int count=0;
        int num=1;
        while(count<=10)
        {
            temp=0;
            for(int i=1;i<num;i++)
            {
                if(num%i==0)
                {
                    temp=temp+i;
                }
            }
            if(temp==num)
            {
                System.out.println(num);
                count++;
                sum=sum+num;
            }
            num++;
        }
        System.out.println(sum);
    }
}