/*Program to eliminate special characters and numbers other than [a, A---z, Z].*/

class pro10
{
    public static void main(String[] args) {
        String word="su3^3rya3432@";
        char[] arr = word.toCharArray();
        String s="";
        for(int i=0;i<arr.length;i++)
        {
            
           if((arr[i]>='A' && arr[i]<='Z')||(arr[i]>='a' && arr[i]<='z'))
            {
                s=s+arr[i];
                
            }
        }
        System.out.println("String after removing special chars and nums : "+s);
    }
}