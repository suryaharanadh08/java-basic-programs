import java.util.Scanner;
class pro4{
    
    static int userInput(){
        int Tel,Eng,Hin,Mat,Sci;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student name : ");
        String studname = scan.nextLine();
        System.out.println("Enter your Telugu marks : ");
        Tel = scan.nextInt();
        System.out.println("Enter your Hindi marks : ");
        Hin = scan.nextInt();
        System.out.println("Enter your English marks : ");
        Eng = scan.nextInt();
        System.out.println("Enter your Maths marks : ");
        Mat = scan.nextInt();
        System.out.println("Enter your Science marks : ");
        Sci = scan.nextInt();
        if(Tel<35 ||Eng<35 ||Hin<35 ||Mat<35 ||Sci<35){
            System.out.println("you got failed , GOOD LUCK NEXT TIME");
            int set=1;
            return set;
        }

        int total =Tel+Hin+Eng+Mat+Sci;
        return total;
    }

    static void calcGrade(int tot){
        if(tot>450){
            System.out.println("CONGRATS!you passed with A+ GRADE");
        }
        if(tot>=400 && tot<450){
            System.out.println("CONGRATS!you passed with A GRADE");
        }
        if(tot>=300 && tot <400){
            System.out.println("CONGRATS!you passed with B GRADE");
        }
        if(tot>=200 && tot <300){
            System.out.println("CONGRATS!you passed with c GRADE");
        }
        if(tot<200){
            System.out.println("you got failed , GOOD LUCK NEXT TIME");
        }

    }
    public static void main(String[] args) {
      
      int var=userInput();
      if(var!=1){
      calcGrade(var);   
    }     
      
             
    }
}