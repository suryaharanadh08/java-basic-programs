/*Program to print the names who started with the given array of strings */


class pro11
{
    public static void main(String[] args) 
    {
        String[] names={"surya","hari","alex","sriram"};
        String[] arr={"s","a"};
        for(String key: arr)
        {
           for(String name : names)
           {
               char a =name.charAt(0);
               String b=Character.toString(a);
               //System.out.println(b+" "+key);
               if(key.equals(b))
               {
                System.out.println(name);
               }
           }
        }
        
        
        


    }
}