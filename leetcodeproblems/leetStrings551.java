class Solution {
    public static boolean checkRecord(String s) {
        int count =0;
        boolean flag=true;
        char a,b,c;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                count++;
            }
            if(count==2)
            {
                
                flag=false;
                break;
            }
        }
        for(int i=0;i<s.length()-2;i++)
        {
            a=s.charAt(i);
            b=s.charAt(i+1);
            c=s.charAt(i+2);
            if(a=='L' && b=='L' && c=='L')
            {
                flag=false;
                break;
            }
        }
        
        return flag;
    }
    public static void main(String args[])
    {
        String attendence = "PPALLL";
        System.out.println(checkRecord(attendence));
    }
}