package Nhat1613133;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Vd1 {
    public static void main(String[] args  ) throws IOException{
        FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\javabuoi7.txt");
        String text="hello word";
        byte[] textbyte= text.getBytes();
        fo.write(textbyte);
    }

}
