class commonCharacters
{
    public static void main(String[] args) {
        String s = "surya";
        String t = "hari";
        System.out.println("Common characters are : ");
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    System.out.println(t.charAt(j));
                }
            }
        }
    }
}