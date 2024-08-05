class pro20{
    public static void main(String[] args) {
        int num=11675711;
        String x=Integer.toString(num);
        char j=x.charAt(0);
        int count=000;
        for(int i=0;i<x.length();i++)
        {
            if(j!=x.charAt(i))
            {
                count=555;
                break;
                
            }
            
        }
        if(count==555)
            {
                System.out.println("DIGITS ARE NOT SAME..");

            }
            else{
                System.out.println("Digits are  same..");

            }
    }
}