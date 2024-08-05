class pro9{
    static void mymethod(int i){
        System.out.println("method with one parameeter...");
    }
    static void mymethod(int i,int j){
        System.out.println("method with two parameters...");
    }
    static void mymethod(int i,int j,int k){
        System.out.println("method with three parameters...");
    }
    public static void main(String[] args) {
        mymethod(1);
        mymethod(1,2);
        mymethod(1,2,3);        
    }
}