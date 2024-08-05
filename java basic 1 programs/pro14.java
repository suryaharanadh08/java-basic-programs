class main{
    int k=30;

}
class pro14{
     static int i=23;//static variable
    public static void main(String[] args) {
        final int j=9;//Local variable
        System.out.println("calling a static variable :"+i);
        System.out.println("calling a final variable :"+j);
        main obj = new main();
        System.out.println("calling an instance variable : "+obj.k);
    }
}