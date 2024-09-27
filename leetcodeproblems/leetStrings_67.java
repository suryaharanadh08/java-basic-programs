class Solution {
    public static void addBinary(String a, String b) {
        double x=0,y=0;
        double sum=0;
        
        for(int i=a.length()-1;i>=0;i--)
        {
            if(a.charAt(i)!='1')
            {
                x=x+Math.pow(2,i);
            }
        }
        System.out.println(x);
        for(int i=b.length()-1;i>=0;i--)
        {
            if(b.charAt(i)!='0')
            {
                System.out.println(i);
                y=y+Math.pow(2,i);
            }
        }
        System.out.println(y);
    }
    public static void main(String args[])
    {
        addBinary("101","110");
    }
}