class pro{
   
    static void forEven(int n){
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    static void whileEven(int n){
        int i=0;
        while(i<=n)
        {
             if(i%2==0){
                System.out.println(i);
            }
            i++;
            
        }
    }
    static void doWhileEven(int n){
        int i=0;
        do{
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }while(i<=n);
    }
   

    public static void main(String[] args) {
        forEven(10);
        whileEven(10);
        doWhileEven(10);
    }
}