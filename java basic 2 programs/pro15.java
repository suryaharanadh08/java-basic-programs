class pro15{
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int j=0;
        int temp=1;
        int sum=0;
        System.out.println("0\n1");
        while(i<=n)
        {
            sum=temp+j;
            System.out.println(sum);
             j=temp; 
            temp=sum;
                    
            i++;

        }    
      
    }
}