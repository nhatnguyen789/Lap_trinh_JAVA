package bang_cuu_chuong;
import java.util.Scanner; // chứa các lớp tiện ích

public class bang_cuu_chuong{
    public static void main(String[]args){
        while(true) {
            int n, a;
            System.out.println("1.bang cuu chuong"); //hàm xuất ra màn hình có xuống dòng
            System.out.println("2.trung binh cong cac so chia het cho 3 tu 27 den 250");//hàm xuất ra màn hình có xuống dòng
            Scanner scanner = new Scanner(System.in); //tạo đối tượng Scanner;
            n = scanner.nextInt(); //Nhập một số nguyên
            switch (n) {
                case 1: {

                    System.out.println("bang cuu chuong can xuat la:"); //hàm xuất ra màn hình có xuống dòng
                    a = scanner.nextInt(); //Nhập một số nguyên rồi gán giá trị cho a
                    for (int i = 1; i <= 10; i++) { //vòng lặp chỉ số chạy từ i=1 đến 10
                        System.out.println(a + "*" + i + "=" + a * i);//xuất ra màn hình có xuống dòng
                    }
                }
                break;
                case 2: {
                    System.out.println("tong cac so chia het cho 3 la:");//xuất ra màn hình có xuống dòng
                    int s = 0;
                    for (int j = 27; j <= 250; j++) {
                        if (j % 3 == 0) {
                            s = s + j;
                        }
                    }
                    System.out.println("ket qua la: " + "=" + s);//in ra kết quả có xuống dòng
                }
                break;
            }
        }
    }
}
