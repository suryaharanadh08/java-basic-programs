class Solution {
    public static String restoreString(String s, int[] indices) {
        s=s;
        char[]arr =new char[s.length()];
        int j=0;
        String res="";
       for(int i:indices)
       {
           arr[i]=s.charAt(j);
           j++;
       }
        for(int i=0;i<s.length();i++)
        {
            res=res+Character.toString(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "leet";
        int[] indices={2,3,1,0};
        String val=restoreString(s,indices);
        System.out.println(val);
    }
}