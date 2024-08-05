class pro14{

    static void perNum(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum =sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect num ..");
        }
        else{
            System.out.println("Not a perfect num..");
        }
    }


    public static void main(String[] args) {
        perNum(28);
    }
}