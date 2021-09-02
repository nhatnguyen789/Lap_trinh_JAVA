import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Maps {
    //private static Scanner //chau5;

    //@SuppressWarnings("resource")
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Map<String,String> c = new HashMap<String,String>();
        c.put("Hi", "Xin Chào");
        c.put("Name", "Tên");
        Scanner chau = new Scanner(System.in);
        int ch;
        System.out.println("Nhap lua chon.\n0.Thoat chuong trinh.\n1.Them tu va them nghia.\n"
                + "2.Tim nghia cua tu.\n3.Sua nghia cua tu.");
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
                    System.out.println("Sua nghia cua tu.");
                    System.out.println("Nhap tu can sua:");
                    String t3, t4;
                    Scanner chau4 = new Scanner(System.in);
                    t3=chau4.nextLine();
                    if(c.get(t3)==null)
                        System.out.println("Khong tim thay.");
                    else
                    {
                        System.out.println("Nhap nghia moi cua tu. Phai la chu thuong khong co chua viet hoa:");
                        Scanner chau5 = new Scanner(System.in);
                        t4=chau5.nextLine();
                        do
                        {
                            for(int i=0;i<t4.length();i++)
                            {
                                if(t4.codePointAt(i)>=65 && t4.codePointAt(i)<=90)
                                    d=d+1;
                                //System.out.println(d);
                            }
                            if(d>0)
                            {

                                System.out.println("Tu co chu hoa. Moi nhap lai");
                                //Scanner chau6=new Scanner(System.in);
                                t4=chau5.nextLine();
                                //System.out.println(t4);
                                d=0;
                                //System.out.println(d);
                            }
                            else
                            {
                                c.replace(t3,t4);
                                System.out.println(c.get(t3));
                                break;
                            }
                        } while(d==0);

                        //System.out.println("nnnn");
                        //c.replace(t3,t4);
                        //c.put(t3, t4);
                        //System.out.println(c.get(t3));
                        //break;
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

