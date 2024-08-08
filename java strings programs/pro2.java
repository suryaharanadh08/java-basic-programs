class pro2
{
    public static void main(String args[])
    { 
        //Finding the length of the string without using any predefined methods
        String word = new String("Java");
        int i=0;
        int count=0;
       try {
        
        while(true)
        {
           
            if(word.charAt(i)==-1)
            {
                break;
            }
             count++;
            i++;
        }    
        
       }
      catch (Exception e) { } 
       System.out.println("length of the string is : "+count);

        //Reverse the given String
        try
        {
            for(int j=count-1;j>=0;j--)
              {
                 System.out.println(word.charAt(j));
              }
        }
        catch(Exception e){}
 

           
    }
}