class demo{
    void mymethod(){
        System.out.println("object created using new keyword");
    }
}
class pro7{

    public static void main(String[] args) {
       demo obj = new demo();
       obj.mymethod(); 
       
    }
}