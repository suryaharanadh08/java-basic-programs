import java.io.*;
public class DemoFileOutputStream {  
    public static void main(String args[]) throws IOException{    
            
             FileOutputStream fout=new FileOutputStream("demo.txt");       
             fout.write('B');    
             fout.close();    
             System.out.println("success...");    
 
      }    
}  