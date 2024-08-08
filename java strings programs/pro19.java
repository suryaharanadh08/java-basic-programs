class pro19
{
    public static void main(String[] args) {
        String s = "welcome to java";
        String[] ch = s.split(" ");
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.println(ch[i]);
        }
    }
}