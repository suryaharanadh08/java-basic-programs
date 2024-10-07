import java.io.*;
class DemoFileInputStream{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("demo.txt");
        int j=0;
        while((j=fis.read())!=-1)
        {
            System.out.print((char)j);
        }
    }
}