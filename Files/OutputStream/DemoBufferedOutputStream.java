import java.io.*;
public class DemoBufferedOutputStream {  
    public static void main(String args[]) throws IOException{    
            FileOutputStream fout = new FileOutputStream("demo.txt");
             BufferedOutputStream bout=new BufferedOutputStream(fout);
             String text = "surya";
             byte b[] = text.getBytes();       
             bout.write(b);    
             bout.close();    
             System.out.println("success...");   
      }    
}  