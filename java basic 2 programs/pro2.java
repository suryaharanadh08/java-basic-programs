class pro2{
    public static void main(String[] args) {
        int year= 2200;
        if(year%4==0){
            if(year%400==0 || year%100!=0){
                System.out.println("It is a leap year");
            }
            else{
                System.out.println("It is a non leap year");
            }
        }
        else{
        System.out.println("Non leap year");
        }
        }
}