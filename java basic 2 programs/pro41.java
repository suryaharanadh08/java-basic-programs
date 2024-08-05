class pro41
{
    public static void main(String[] args) {
        int[] arr={10,33,20,40,55};
        int sum=0;
        boolean x=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                x=true;
            }
            if(x)
                 System.out.print("Even :"+arr[i]+" ");
            else
                 System.out.print("Odd "+arr[i]+" ");
            x=false;
        
        }
        
        
    }
}