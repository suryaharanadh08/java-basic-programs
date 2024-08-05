

class Main{
       
    private final int empid=343445;
    static final String empname="kalki";
    int empsalary = 430000;
    void printmsg(){
        System.out.println(empid);
    }
}
class demoEncapsulation extends Main{
    public static void main(String[] args) {
        System.out.println("welcome");
        Main obj = new Main();
        System.out.println(obj.empname);
        obj.printmsg();
        
    }
}