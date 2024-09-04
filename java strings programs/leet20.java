class Solution {
    public static boolean isValid(String s) {
       String s1="";
       String s2="";
       String s3[]={"{","}","(",")","[","]"};
       boolean flag=false;
       if(s.length()%2!=0)
       {
        flag=false;
        return flag;
       } 
       else
       {
        for(int i=0;i<s.length()-1;i++)
        {
            s1=Character.toString(s.charAt(i));
            s2=Character.toString(s.charAt(i+1));
            System.out.println(s1+" "+s2);
            if(s1.equals("{") && s2.equals("}"))
             {
                flag=true;
             }
             else if(s1.equals("[") && s2.equals("]"))
             {
                  flag=true;            
             }
             else if(s1.equals("(") && s2.equals(")"))
              {
                flag=true;               
              }
              else
                 {
                        flag=false;
                        break;
                 }
             i++;
        }
        return flag;
       }
    }
    public static void main(String args[])
    {
        String s="{}[]()";
        System.out.println(isValid(s));
    }
}