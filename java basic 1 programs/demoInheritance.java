class vehicle{

    String company="Audi";
    String model ="R8";
    String year="2024";

    void start(){
        System.out.println(company+"  "+model+" started...");
    }
    void stop(){
        System.out.println("stopped...");
    }
}
class demoInheritance extends vehicle{
    public static void main(String[] args) {
        vehicle obj = new vehicle();
        obj.start();
        obj.stop();
    }
}