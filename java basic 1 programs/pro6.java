class pro6{
    static void circleArea(int r){
        int res1=(22/7)*r*r;
        System.out.println("Area of the circle with radius"+r+"is :"+res1);
        
    }
     void cubeOfGivennum(int c){
        int res2=c*c*c;
        System.out.println("Cube of the Given num :"+res2);
    }
    public static void main(String[] args) {
        circleArea(4);
        pro6 obj = new pro6();
        obj.cubeOfGivennum(4);
    }
}