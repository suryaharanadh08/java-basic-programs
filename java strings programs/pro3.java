//Program to find maximum and minimum occurring character in a string

class pro3
{
    public static void main(String[] args)
    {
         String word="aaaabbbc";
        int max = 0,min = 1;
        char maxchar='X';  //default values
        char minchar='X';

        for(int i=0;i<word.length();i++)
        {
            int count=1;
            
            for(int j=0;j<word.length();j++)
            {
                if(word.charAt(i)==word.charAt(j))
                {
                    if(i==j){}
                    else
                    {

                        // System.out.println(word.charAt(j));
                         count++;
                    }
                   
                }
                if(count>=max)
               {
                    max=count; 
                     maxchar=word.charAt(i);  
               }
               if(count<=min)
               {
                    min=count;
                    minchar=word.charAt(i);
               }

                
            }
            
        }
        System.out.println("Most occured character is "+maxchar+" "+max+" times");
        System.out.println("Least occured character is "+minchar+" "+min+" times");
    }
}