import java.util.StringTokenizer;
class wordsReverseInString {
    public static String reverseWords(String s1) {
        StringTokenizer s2 = new StringTokenizer(s1);
        String ans="";
        while(s2.hasMoreTokens())
        {
            String temp = s2.nextToken();
            for(int i=temp.length()-1;i>=0;i++)
            {
                System.out.println(temp.charAt(i));
               ans=ans+temp.charAt(i)+" ";
            
            }       
        }return ans;
    }
    public static void main(String args[])
    {
        String s ="Lets's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}