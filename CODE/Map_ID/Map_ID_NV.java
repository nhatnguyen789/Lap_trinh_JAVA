import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_ID_NV {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Map<String,String> p = new HashMap<String,String>();
            p.put("a1234", "Steve Jobs");
            p.put("a1235", "Scott McNealy");
            p.put("a1236", "Jeff Bezos");
            p.put("a1237" , "Larry Ellison");
            p.put("a1238", "Bill Gates");
            System.out.println(p);
            String a,b;
            Scanner h= new Scanner(System.in);
            System.out.println("Nhap id cua nguoi can tim kiem ");
            a=h.nextLine();   //nhập một chuoxi
            b=a.toLowerCase();      //trả về chuỗi chữ thường
            if(p.get(b)==null)
            {
                System.out.println("Khong tim thay");
            }
            else
                System.out.println(p.get(b)); //p.get(b) trả về giá trị tương ứng với chỉ số
            h.close();
        }
}

