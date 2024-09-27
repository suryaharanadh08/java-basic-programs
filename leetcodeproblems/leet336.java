
import java.util.*;

class Solution {
    public static List<List<Integer>> palindromePairs(String[] words) {
        String t1,t2="";
         List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            t1=words[i];
            t2="";
            char[] arr = t1.toCharArray();
            for(int k=arr.length-1;k>=0;k--)
            {
                t2=t2+Character.toString(t1.charAt(k));
            }
            for(int j=0;j<words.length;j++)
            {
               
                if(t2.equals(words[j]))
                {
                    list.add(Arrays.asList(i,j));
                 
                }
            }
        }
          return list;
    }
    public static void main(String[] args) {
        String str[]={"abcd","dcba","lls","s","sssll"};
        System.out.println(palindromePairs(str));
    }
}