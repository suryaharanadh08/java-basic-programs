class pro19{
    public static void main(String[] args) {
         
         int num =33445533;
         String x=Integer.toString(num);
        for(int i=0;i<=x.length();i++)
        {   int count =0;
             for(int j=0;j<x.length();j++)
             {
                if(x.charAt(i)==x.charAt(j))
                count++;
             }
             System.out.println(x.charAt(i)+" is "+count+"times");
        }
        }
    }
