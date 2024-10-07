import java.io.*;
public class DemoByteArrayOutputStream {  
    public static void main(String args[]) throws IOException{   
        
            FileOutputStream fout1 = new FileOutputStream("A.txt");
            FileOutputStream fout2 = new FileOutputStream("B.txt");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            String s = "killer";
             bout.write(s.getBytes());    
             bout.writeTo(fout1);
             bout.writeTo(fout2);
             bout.close();    
             System.out.println("success...");    
      }    
}  