/*Program to count the number of vowels and consonants in a given string. */
class pro12
{
    public static void main(String[] args)
     {
         String word = "surya";
         String word2 = word.toLowerCase();
         String[] vow = {"a","e","i","o","u"};
         int cvow=0;
         String s;
         for(int i=0;i<word.length();i++)
         {
            s=Character.toString(word.charAt(i));
            for(int j=0;j<vow.length;j++)
            {
                //System.out.println(s+" "+vow[j]);
                if(s.equals(vow[j]))
                {
                    cvow++;
                }
        
            }
         }
         System.out.println("NO of vowels are :"+cvow);
         System.out.println("NO of consonants are :"+(word.length()-cvow));
     }

}