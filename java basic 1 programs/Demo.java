class DemoRecursion{

   public static int mymethod(int i){
      if(i<=10){
         System.out.println(i);
         return mymethod(i+1);
      }
      else{
         return 0;
   }}
   public static void main(String[] args) {
       int i=0;
       DemoRecursion obj = new DemoRecursion();
       obj.mymethod(i);
   }
}