

class countOfPalindromes
{
    public static void main(String[] args) {
        String s[] ={"madam","racecar","surya"};
         int count=0;
        for(int i=0;i<s.length;i++)
        {
            String t=s[i];
            String temp ="";
           
            //System.out.println(t);
            for(int j=t.length()-1;j>=0;j--)
            {
              temp=temp+t.charAt(j);
            }
           // System.out.println(temp);
            if(temp.equals(t))
            {
                count++;
                
            }        
        
        }System.out.println("Total no of palindromes are : "+count);
    }
}