package bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        QuanLyThiSinh qlts = new QuanLyThiSinh();
        while(true)
        {
            System.out.println("Application manager Candidate");
            System.out.println("1. add thi sinh");
            System.out.println("2.Show thong tin");
            System.out.println("3.Tim thi sinh bang so bao danh");
            System.out.println("4. Exit");
            String line = scanner.nextLine();
            switch (line)
            {
                case "1":
                {
                    System.out.println("a. them thi sinh khoi A");
                    System.out.println("b. them thi sinh khoi B");
                    System.out.println("c.them thi sinh khoi C");
                    String type = scanner.nextLine();
                    switch(type)
                    {
                        case "a":
                        {
                            qlts.add(createThiSinh(scanner,"a"));
                            break;
                        }
                        case "b":
                        {
                            qlts.add(createThiSinh(scanner,"b"));
                            break;
                        }
                        case "c":
                        {
                            qlts.add(createThiSinh(scanner,"c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    qlts.showInfor();
                    break;
                }
                case "3":
                {
                    System.out.print("Nhap so bao danh:");
                    String id = scanner.nextLine();
                    ThiSinh thisinh = qlts.searchById(id);
                    if(thisinh == null)
                    {
                        System.out.println("Not found");
                    }
                    else
                    {
                        System.out.println(thisinh.toString());
                    }
                    break;
                }
                case "4":
                {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
    public static ThiSinh createThiSinh(Scanner scanner, String cate)
    {
        System.out.print("Nhap id");
        String soBaoDanh = scanner.nextLine();
        System.out.print("Nhap ten:");
        String hoTen = scanner.nextLine();
        System.out.print("nhap dia  chi:");
        String diaChi = scanner.nextLine();
        System.out.print("Nhap muc uu tien:");
        String mucUuTien = scanner.nextLine();
        scanner.nextLine();
        if(cate.equals("a"))
        {
            return new KhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
        }
        else if (cate.equals("b"))
        {
            return new KhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
        }else
        {
            return new KhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
        }
    }
}
