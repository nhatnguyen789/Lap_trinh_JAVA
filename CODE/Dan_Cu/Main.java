package bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        KhuPho khupho = new KhuPho();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhap dia chi:");
            scanner.nextLine();
            String diaChi = scanner.nextLine();

            List<Nguoi> nguoi = new ArrayList<>();
            System.out.println("Nhap so nguoi:");
            int number = scanner.nextInt();

            Nguoi nguoi1 = new Nguoi(String hoTen, int tuoi, String ngheNghiep, int cmnd);
            nguoi.add(nguoi1);
            System.out.println(nguoi1.toString());
            khupho.addGiaDinh(new HoGiaDinh(nguoi, diaChi));
        }
    }

}
