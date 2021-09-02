/* Tạo map liên kết từ và nghĩa của từ trong từ điển. Để đơn giản bạn có thể chọn keys values cùng một
 kiểu String và thực hiện các yêu cầu sau:
              từ                        nghĩa
              Hi                        xin chào
              Name                       tên
          +Tạo menu cho người dùng chọn:
          0: thoát chương trình
          1:Thêm từ và thêm nghĩa của từ đó
          2:Tìm nghĩa của từ khi người dùng nhập vào từ bất kỳ(cả hoa và thường), nếu không có từ đó thì in ra màn
          hình: không tìm thấy.
          3.Tìm nghĩa của từ khi người dùng nhập vào từ bất kỳ nhưng chỉ cho phép người dùng nhập vào chữ thường
     khi người dùng nhập chữ hoa sẽ bắt nhập lại, nếu không có từ đó thì in ra màn hình: không tìm thấy.
          4. Sửa nghĩa của từ khi người dùng nhập vào từ bất kì và in ra màn hình nghĩa mới của từ đã sửa.
          Nếu không có từ đó thì in ra màn hình: không tìm thấy.
          Biết ASCII của chữ hoa bắt đầu từ 65-90.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TuDien {

        @SuppressWarnings("resource")
        public static void main(String[] args) {
            Map<String,String> c = new HashMap<String,String>();
            c.put("Hi", "Xin Chao");
            c.put("Name", "Ten");
            Scanner chau = new Scanner(System.in);
            int ch;
            System.out.println("Nhap lua chon.\n"
                    + "0.Thoat chuong trinh.\n"
                    + "1.Them tu va them nghia.\n"
                    + "2.Tim nghia cua tu.\n"
                    + "3.Tim nghia cua tu(khong duoc viet hoa).\n"
                    + "4.Sua nghia cua tu");
            ch=chau.nextInt();
            while(ch != 0)
            {
                switch(ch)
                {
                    case 1:
                        System.out.println("Them tu va them nghia cua tu.");
                        System.out.println("Nhap tu:");
                        String t,n;
                        Scanner chau1 = new Scanner(System.in);
                        t=chau1.nextLine();
                        System.out.println("Nhap nghia:");
                        Scanner chau2 = new Scanner(System.in);
                        n=chau2.nextLine();
                        c.put(t, n);
                        System.out.println("Them tu thanh cong!");
                        break;
                    case 2:
                        System.out.println("Tim nghia cua tu.");
                        System.out.println("Moi nhap tu can tim:");
                        String t1;
                        Scanner chau3 = new Scanner(System.in);
                        t1=chau3.nextLine();
                        if(c.get(t1)==null )
                            System.out.println("Khong tim thay!");
                        else
                            System.out.println("Nghia cua tu la:" + c.get(t1));
                        break;
                    case 3:
                        int d=0;
                        System.out.println("Tim nghia cua tu.");
                        System.out.println("Moi nhap tu can tim:");
                        String t5;
                        Scanner chau6 = new Scanner(System.in);
                        t5=chau6.nextLine();
                        do
                        {
                            for(int i=0;i<t5.length();i++)
                            {
                                if(t5.codePointAt(i)>=65 && t5.codePointAt(i)<=90)
                                    d=d+1;
                                //System.out.println(d);
                            }
                            if(d>0)
                            {

                                System.out.println("Tu co chu hoa. Moi nhap lai");
                                //Scanner chau6=new Scanner(System.in);
                                t5=chau6.nextLine();
                                //System.out.println(t4);
                                d=0;
                                //System.out.println(d);
                            }
                            else
                            {
                                break;
                            }
                        } while(d==0);
                        if(c.get(t5)==null )
                            System.out.println("Khong tim thay!");
                        else
                            System.out.println("Nghia cua tu la:" + c.get(t5));
                    case 4:
                        int p=0;
                        System.out.println("Sua nghia cua tu.");
                        System.out.println("Nhap tu can sua:");
                        String t3, t4;
                        Scanner chau4 = new Scanner(System.in);
                        t3=chau4.nextLine();
                        if(c.get(t3)==null)
                            System.out.println("Khong tim thay.");
                        else
                        {
                            System.out.println("Nhap nghia moi cua tu:");
                            Scanner chau5 = new Scanner(System.in);
                            t4=chau5.nextLine();

                            c.replace(t3,t4);
                            System.out.println(c.get(t3));

                        }
                        break;

                }
                System.out.println("Nhap lai lua chon:");
                ch=chau.nextInt();
            }
            chau.close();
            //chau5.close();
            // TODO Auto-generated method stub

        }
}

