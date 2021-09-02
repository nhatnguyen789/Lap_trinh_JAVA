package main;              //là tập hợp các thứ như các lớp,các pakage con,tránh sự xung đột trong điều khiển truy cập trong các lớp
import java.util.Scanner; //
public  class Btdt{       //mọi chương trình java phải có ít nhất một lớp class
      public static void main(String[]args){ //là điểm bắt đầu chạy chương trình có dạng như vậy 
         int n;
         Scanner scanner =new Scanner(System.in);//tạo đổi tượng
         n=scanner.nextInt();            //Nhập số nguyên( số lượng hàng * của tam giác)
         while(n>0) {                    // điều kiện nếu n>0 thì thực hiện chương trình
             for (int i = 1; i <= n; i++) {       //vòng lặp chạy số hàng của tam giác
                 for (int j = 1; j <=n - i; j++) {  // vòng lặp này có tác dụng in ra khoảng trắng
                     System.out.print(" ");
                 }
                 for (int k = 1; k <= i; k++) { //vòng lặp này có tác dụng tiếp tục in ra chỉ số, và khoảng trắng
                     System.out.print(i + " "); //vi du:i=1, n=5 in ra 4 khoảng trắng xong in tiếp số 1 ngay dòng đó
                 }
                 System.out.print("\n"); // có tác dụng xuống dòng, ví dụ i=1, xuống dòng quay lại vòng lặp i=2, tiếp tục như vậy
             }
             System.out.println(" xin moi ban nhap lai");
             n = scanner.nextInt();
         }
    }
}

