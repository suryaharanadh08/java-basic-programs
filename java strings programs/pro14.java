/*Program to replace each word’s first letter with its previous character in a given*/

class pro14
{
    public static void main(String[] args) {
        String s = "welcome to java programming world";
        String[] arr = s.split(" ");
        String temp; 
        String temp2;
        System.out.println(arr[0]);
        for(int i=0;i<arr.length-1;i++)
        {
            temp=arr[i];
            char x=temp.charAt(temp.length()-1);
            temp2= arr[i+1];
            temp2=temp2.replace(temp2.charAt(0),x);
            System.out.println(temp2);
        }
    }
    
}
