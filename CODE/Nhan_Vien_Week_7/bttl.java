import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bttl {
    public static void main(String[] args) throws IOException {
        Scanner p = new Scanner(System.in);
        String a, b;
        int n1=0;
        int n2=0;
        System.out.println("Nhap ma so nhan vien");
        a = p.nextLine();
        System.out.println("Nhap ten nhan vien");
        Scanner h = new Scanner(System.in);
        b = h.nextLine();
        Scanner t = new Scanner(System.in);
        System.out.println("Nhap tuoi nhan vien");
        int tuoi = t.nextInt();
        System.out.println("Nhap luong nhan vien");
        float luong = t.nextFloat();
        NhanVien nv = new NhanVien(a, b, tuoi, luong);
        FileOutputStream nv1 = new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\javabuoi7.txt");
        String text = nv.toString();
        byte[] textbyte = text.getBytes();
        nv1.write(textbyte);

        System.out.println("Nhap ma so nhan vien thu 2");
        Scanner p1 = new Scanner(System.in);
        String a1 = p1.nextLine();
        System.out.println("Nhap ten nhan vien thu 2");
        Scanner a2 = new Scanner(System.in);
        String b1 = a2.nextLine();
        System.out.println("nhap tuoi ");
        int tuoi1 = t.nextInt();
        System.out.println("nhap luong");
        float luong2 = t.nextFloat();
        NhanVien nv3 = new NhanVien(a1, b1, tuoi1, luong2);
        String them = nv3.toString();
        byte[] textbyte1 = them.getBytes();
        nv1.write(textbyte1);
        FileInputStream nv2 = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\javabuoi7.txt");
        int c = nv2.available();
        byte[] a3 = nv2.readNBytes(c);
        String a4 = new String(a3);
        System.out.println(a4);
        ArrayList<NhanVien> NV = new ArrayList<>();
        NV.add(nv3);
        NV.add(nv);
        System.out.println("Nhap id can tim");
        Scanner tim = new Scanner(System.in);
        String tim1 = tim.nextLine();
        if (a4.contains(tim1))
        {
            int n=a4.length();
            n2=a4.indexOf(tim1);
            n1=a4.indexOf("\n");
            String b2=a4.substring(n2, n1-1);
            System.out.println(b2);

        }else System.out.println("Khong tim thay");
        /*while ((c = nv2.read()) != -1) {
            System.out.println((char) c);
            //}*/
        }
}
