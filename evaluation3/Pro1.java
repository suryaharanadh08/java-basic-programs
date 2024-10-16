//write a program to serialize and deserializable collection classs objects
import java.util.*;
import java.io.*;

// class Pro1{
//     public static void main(String args[]) throws IOException{
//         FileOutputStream fos = new FileOutputStream("demo.ser");
//         ObjectOutputStream o = new ObjectOutputStream(fos);
//         ArrayList al = new ArrayList<>();
//         al.add("surya");
//         al.add("hari");
//         o.writeObject(al);
//     }
// }
class Pro1{
    public static void main(String args[]){
        try{
        
        FileInputStream fin = new FileInputStream("demo.txt"); 
        ObjectInputStream o = new ObjectInputStream(fin);
        ArrayList al = (ArrayList) o.readObject();
           System.out.println(al.get(1));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}