package SinhHoanvi;

import java.util.Scanner;// lớp chứa các tiện ích

public class Main {
    public static void printarray(int [] a) //phương thức static có thể truy cập trực tiếp không cần tạo đối tượng
    {                      //và có thể thay đổi giá trị của biến static.
        for(int i=0;i< a.length;i++)          //a.lenth độ dài của chuỗi
        {
            System.out.print(a[i]);          //in ra giá trị các phần tử của chuỗi
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner SC =new Scanner(System.in);             //tạo đối tượng SC
        System.out.println("input your number:");       //hàm xuất ra màn hình, chọn số phần tử
        int n= SC.nextInt();                           //Nhập một số nguyên rồi gán cho n
        int[] a=new int[n];                          //mảng a chứa n phần tử
        for(int i=0;i<a.length;i++)                //a.length độ dài của mảng
        {
            a[i]=i+1;                       //gán giá trị
        }
        printarray(a);                   //gọi hàm(phương thức) printarray(a)
        System.out.println(" ,");          //in ra dấu phẩy
        int dem=1;                           //dem=1;
        for(int i=n-1;i>0;i--) {             //vòng for chạy từ n-1 đến 1
            if (a[i] > a[i - 1]) {            //nếu phần tử ở a[i] >a[i-1] thì dùng vòng for tiếp theo
                for (int j = n - 1; j >= i; j--) { // chạy từ n-1 đến i
                    if (a[j] > a[i - 1]) {    //nếu a[j] lớn hơn a[i-1]
                        int temp = a[i - 1];
                        a[i - 1] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
                int S = n - 1;
                while (i < S) {
                    int temp = a[i];
                    a[i] = a[S];
                    a[S] = temp;
                    i++;
                    S--;
                }
                printarray(a);
                System.out.print("  \t");
                i = n;
                dem++;
            }
        }
        System.out.println("\b\b\n sum swap:"+dem);
    }
}
//thuật toán:
//1.Xác định đoạn cuối giảm dần dài nhất, tìm chỉ số i của phần tử a[i] bắt đầu đoạn cuối đó.
// Điều này đồng nghĩa với việc tìm từ vị trí cuối dãy lên đến phần tử thứ 2 (vì nếu tìm được ở phần tử
// đầu tiên tức đó là hoán vị cuối cùng rồi nên không cần), gặp chỉ số i đầu tiên thỏa mãn a[i-1] < a[i].
//2.Nếu tìm thấy chỉ số i như trên
//– Trong đoạn cuối giảm dần, tìm phần tử a[k] nhỏ nhất thoả mãn điều kiện a[k] > a[i-1].
// Do đoạn cuối giảm dần, điều này thực hiện bằng cách tìm từ cuối dãy lên đầu gặp chỉ số k
// đầu tiên thoả mãn a[k] > a[i-1] (có thể dùng tìm kiếm nhị phân).
//– Đảo giá trị a[k] và a[i-1]
//– Lật ngược thứ tự đoạn cuối giảm dần (từ a[i] đến a[k]) trở thành tăng dần.
//3.Nếu không tìm thấy tức là toàn dãy đã sắp giảm dần, đây là cấu hình cuối cùng.
