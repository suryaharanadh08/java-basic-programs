class pro34
{
    public static void main(String[] args) {
        int[] arr1={1,4,2,4,2,5,};
        int len=arr1.length;
        int[] arr2 =new int[len];
        for(int i=0;i<len;i++)
        {
            arr2[i]=arr1[i];
            
        }
         System.out.print("printing the elements in arr2 : ");
        for(int i=0;i<len;i++)
        {
            
            System.out.println("\n"+arr2[i]);
        }
        
    }
}