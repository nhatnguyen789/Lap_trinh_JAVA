
import java.util.*;
import java.io.*;

public class ReadNhanVien {
    public static void showAllNhanVien(ArrayList<NhanVien> NV) {
        System.out.println("danh sach nhan vien : ");
        for (NhanVien nvtemp : NV) {
            System.out.println(nvtemp.toString());
        }
    }
    public static void insertNhanVien(ArrayList<NhanVien> NV, String src){
        String temp = "";
        ArrayList<String> TempArr = new ArrayList<>();
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) != 32 ) {
                temp += src.charAt(i);
            }
            else{
                TempArr.add(temp);
                temp = "";
            }
        }
        TempArr.add(temp);
        NhanVien nvTemp = new NhanVien(TempArr.get(0),TempArr.get(1),Integer.parseInt(TempArr.get(2)),Float.parseFloat(TempArr.get(3)));
        NV.add(nvTemp);
    }
    public static void main(String[] args) {
        ArrayList<NhanVien> NV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        File F = new File("C:\\Users\\DELL\\IdeaProjects\\NhanVien.txt");
        try {
            FileReader FR = new FileReader(F);
            BufferedReader BR = new BufferedReader(FR);
            String line="";
            while ((line=BR.readLine())!=null){
                showAllNhanVien(NV);
                insertNhanVien(NV,BR.readLine());
            }
            BR.close();
            FR.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("read success....");
        try {
            FileWriter FW = new FileWriter(F,true);
            BufferedWriter BW = new BufferedWriter(FW);
            System.out.println("them nhan vien moi : ");
            NhanVien nvtemp = new NhanVien();
            nvtemp.nhapThongTin();
            NV.add(nvtemp);
            BW.newLine();
            BW.write(nvtemp.toStringForFile());
            BW.close();
            FW.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("write success....");
        System.out.print("tim nhan vien, nhap ma nv : ");
        String manvTemp = sc.nextLine();
        boolean flag = false;
        for (NhanVien nvtemp:NV) {
            if (nvtemp.getManv().equals(manvTemp)){
                flag = true;
                System.out.println(nvtemp.toString());
            }
        }
        if (!flag){
            System.out.println("khong ton tai nhan vien co ma so " + manvTemp);
        }
    }
}