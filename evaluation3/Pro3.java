class Pro1{
    public static void main(String args[]){
        String s = "miracle";
        char[] vow = {'a','e','i','o','u'};
        char[] temp = s.toCharArray();
        String value="";
        int flag=1;
        for(int i=0; i<s.length();i++){
            for(int j=0;j<vow.length;j++){
                if(temp[i]==vow[j]){
                    System.out.print(temp[i-1]);
                    value = value+temp[i-1];
                    flag=0;
                }                               
            }
            if(flag==1){
                    System.out.print(temp[i]);
                    value=value+temp[i];
                    
            }
            flag=1;
        }

    }
}