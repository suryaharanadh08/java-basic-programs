import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class DemoBufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fout = new FileInputStream("demo.txt");
        BufferedInputStream bis = new BufferedInputStream(fout);
        int j = 0;
        while((j=bis.read() )!=-1)
        {
            System.out.println((char)j);
        }
        int i = bis.read();
        System.out.println((char)i);
    }
}