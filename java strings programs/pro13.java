

/*Program to print the occurrences of each character in a given string*/
class pro13
{
    public static void main(String[] args) {
        String s = "aabccd";
        int count=0;
        char[] arr= s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            count =0;
            for(int j=0;j<arr.length;j++)
            {
                
                if(arr[i]==arr[j])
                {
                   count ++;
                }
                

            }
            System.out.println(arr[i]+" occured "+count+" times");
        }
        
    }
}