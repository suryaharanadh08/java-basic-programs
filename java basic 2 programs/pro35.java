

class pro35{

    static String arr[]={"surya","surya","hari"};
    public static void main(String[] args) {
        int count;
        for(int i =0;i<=2;i++)
        {
            count=0;
            for(String s:arr)
            {
                if(arr[i]==s)
                {
                    count++;
                }
                if(count!=0)
                {
                    System.out.println(s+" is "+count+" times");
                }

            }
            
        }
        
    }
}