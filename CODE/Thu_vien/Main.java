package bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        while(true)
        {
            System.out.println("Application management Documents");
            System.out.println("1. Them tai lieu: ");
            System.out.println("2. Tim kiem tai lieu:");
            System.out.println("3. Show thong tin:");
            System.out.println("4. xoa tai lieu bang ma tai lieu:");
            System.out.println("0. Exit");
            String line = scanner.nextLine();
            switch(line)
            {
                case "1":
                {
                    System.out.println("Enter a: them Book");
                    System.out.println("Enter b: them Bao");
                    System.out.println("Enter c: them tap chi");
                    String type = scanner.nextLine();
                    switch (type)
                    {
                        case "a":
                        {
                            System.out.print("nhap ma tai lieu: ");
                            String maTaiLieu = scanner.nextLine();
                            System.out.print("nhap Nha xuat Ban:");
                            String nhaXuatBan = scanner.nextLine();
                            System.out.print("nhap so ban phat hanh: ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.print("nhap ten tac gia: ");
                            scanner.nextLine();
                            String tenTacGia = scanner.nextLine();
                            System.out.print("nhap so trang: ");
                            int soTrang = scanner.nextInt();
                            TaiLieu sach = new Sach(maTaiLieu, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                            quanLyTaiLieu.addTaiLieu(sach);
                            System.out.println(sach.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "b":
                        {
                            System.out.print("nhap ma tai lieu: ");
                            String maTaiLieu = scanner.nextLine();
                            System.out.print("nhap Nha xuat Ban:");
                            String nhaXuatBan = scanner.nextLine();
                            System.out.print("nhap so ban phat hanh: ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.print("nhap so ngay phat hanh ");
                            int ngayPhatHanh = scanner.nextInt();
                            TaiLieu bao = new Bao(maTaiLieu, nhaXuatBan, soBanPhatHanh, ngayPhatHanh);
                            quanLyTaiLieu.addTaiLieu(bao);
                            System.out.println(bao.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c":
                        {
                            System.out.print("nhap ma tai lieu: ");
                            String maTaiLieu = scanner.nextLine();
                            System.out.print("nhap Nha xuat Ban:");
                            String nhaXuatBan = scanner.nextLine();
                            System.out.print("nhap so ban phat hanh: ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.print("nhap so phat hanh ");
                            int soPhatHanh = scanner.nextInt();
                            System.out.print("nhap thang phat hanh ");
                            int thangPhatHanh = scanner.nextInt();
                            TaiLieu tapchi = new TapChi(maTaiLieu, nhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                            quanLyTaiLieu.addTaiLieu(tapchi);
                            System.out.println(tapchi.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2":
                {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            quanLyTaiLieu.searchSach();
                            break;
                        }
                        case "b": {
                            quanLyTaiLieu.searchBao();
                            break;
                        }
                        case "c":
                            quanLyTaiLieu.searchTapChi();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3":
                {
                    quanLyTaiLieu.showInfor();
                    break;
                }
                case "4":
                {
                    System.out.print("Nhap ma tai lieu:");
                    String maTaiLieu = scanner.nextLine();
                    System.out.println(quanLyTaiLieu.xoaTaiLieu(maTaiLieu)? "success":"fail");
                }
                break;
                case "5":
                {
                    return;
                }
                default:
                    System.out.println("Invalid:");
                    continue;
            }
        }
    }

}
