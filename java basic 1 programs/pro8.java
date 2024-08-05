class pro8{
   
   static int returnVal(int i){
    return i;
   }
   static double returnVal(double j){
    return j;
   }
   static float returnVal(float k){
    return k;
   }


    public static void main(String[] args) {
        System.out.println(returnVal(3));
        System.out.println(returnVal(345.454));
        System.out.println(returnVal(67.6f));
    }
}