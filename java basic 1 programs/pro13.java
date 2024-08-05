class myclass{
    
    myclass(String name){
        System.out.println("constructor 1...");
        this(5);
    }   
    myclass(int num){
        System.out.println("constructor 2...");
    }
       
}
class pro13{
    public static void main(String[] args) {
        myclass obj1 = new myclass("surya");
       
    }
}