import java.io.Serializable;
import java.io.*;

class Employee implements Serializable{
    int id;
    String name;
    Employee(int id, String name){
        this.id= id;
        this.name=name;
    }
}
class DemoSerialization{
    public static void main(String[] args) throws Exception{
        Employee emp = new Employee(1,"Dhruv");
        FileOutputStream fos = new FileOutputStream("Emp.txt");
        ObjectOutputStream o = new ObjectOutputStream(fos);
        o.writeObject(emp);
    }
}