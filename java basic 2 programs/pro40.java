class pro40
{
    public static void main(String[] args) {
        int[] arr={10,30,20,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=arr[i]+sum;
        }
        System.out.println(sum);
    }
}