import java.io.*;
// class Employee implements Serializable{
//     int id;
//     String name;
//     Employee(int id, String name){
//         this.id = id;
//         this.name = name;
//     }
// }
class DemoDeSerialization {
    public static void main(String[] args)throws Exception{
        FileInputStream fis = new FileInputStream("Emp.txt");
      
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee c = (Employee) ois.readObject();
        System.out.println(c.id+" "+c.name+"sura");                  
    }
}