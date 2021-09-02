package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a,b,canh,a1,b1;
        // TODO Auto-generated method stub
        System.out.println("Nhap chieu dai va rong cua hinh chu nhat thu 1");
        Scanner sc =new Scanner(System.in); // tạo đối tượng
        System.out.println("Nhap chieu dai");
        a=sc.nextFloat();
        System.out.println("Nhap chieu rong");
        b=sc.nextFloat();
        System.out.println("Nhap chieu dai va rong cua hinh chu nhat thu 2");
        System.out.println("Nhap chieu dai");
        a1=sc.nextFloat();
        System.out.println("Nhap chieu rong");
        b1=sc.nextFloat();
        System.out.println("Nhap canh cua hinh vuong ");
        canh=sc.nextFloat();
        ChuNhat cn1=new ChuNhat(a,b);
        ChuNhat cn2=new ChuNhat(a1,b1);
        com.company.Vuong v1=new com.company.Vuong(canh);
        System.out.println("Ket qua cua 2 hinh chu nhat la");
        System.out.println("chu nhat 1" +cn1.toString());
        System.out.println("chu nhat 2" +cn2.toString());
        System.out.println("Ket qua cua hinh vuong la");
        System.out.println(v1.toString());
    }

}


