import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Testfile {
        public static void main(String[] args) throws IOException {
            FileOutputStream p= new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\javabuoi7.txt");
            String text="java buoi 8";
            byte[] textbyte = text.getBytes();
            p.write(textbyte);
            p.close();
            FileInputStream h= new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\javabuoi7.txt");
            int n=h.available();
            //System.out.println(n);
            int c;
            while ((c=h.read())!=-1) {
            }
        }


    }
