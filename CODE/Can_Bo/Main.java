package bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        OficerManage oficerManage = new OficerManage();
        while(true)
        {
            System.out.println("Application manage Officer");
            System.out.println("1. chen Can Bo:");
            System.out.println("2. Tim can bo theo ten: ");
            System.out.println("3. Show thong tin nhan vien:");
            System.out.println("4. exit. ");
            String line = scanner.nextLine();
            switch (line)
            {
                case "1":
                {
                    System.out.println("a. Them ki su: ");
                    System.out.println("b. them cong nhan : ");
                    System.out.println("c. them nhan vien:");
                    String type = scanner.nextLine();
                    switch (type)
                    {
                        case "a":
                        {
                            System.out.print("nhap ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhap nganh:");
                            String nganh = scanner.nextLine();
                            CanBo kisu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganh);
                            oficerManage.addCanBo(kisu);
                            System.out.println(kisu.toString());
                            break;
                        }
                        case "b":
                        {
                            System.out.print("nhap ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhap bac: ");
                            int bac = scanner.nextInt();
                            CanBo congnhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                            oficerManage.addCanBo(congnhan);
                            System.out.println(congnhan.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c":
                        {
                            System.out.print("nhap ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhap bac: ");
                            String congviec = scanner.nextLine();
                            CanBo nhanvien = new Nhanvien(hoTen, tuoi, gioiTinh, diaChi, congviec);
                            oficerManage.addCanBo(nhanvien);
                            System.out.println(nhanvien.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }

                }
                case "2":
                {
                    System.out.print("nhap ten can tim: ");
                    String hoTen = scanner.nextLine();
                    oficerManage.TimCanBo(hoTen).forEach(CanBo->{System.out.println(CanBo.toString());});
                    break;
                }
                case "3":
                {
                    oficerManage.showInforCanBo();
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
}
