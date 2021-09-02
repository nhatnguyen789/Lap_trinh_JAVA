package Nhat_1613133;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args)
    {
        Nhat_1613133.nguoi_thuong nt1=new Nhat_1613133.nguoi_thuong();
        Nhat_1613133.nguoi_thuong nt2=new Nhat_1613133.nguoi_thuong();

        nt1.setHP(2);
        nt1.setSpeed(200);
        nt1.setDamage(200);
        nt1.setTuoi(20);
        nt1.tongcacchiso();

        nt2.setHP(3);
        nt2.setSpeed(300);
        nt2.setDamage(300);
        nt2.setTuoi(300);
        nt2.tongcacchiso();
        System.out.println("HP:"+nt1.HP+"\nspeed:"+nt1.speed+"\ndamage:"+nt1.damage+"\ntuoi:"+nt1.tuoi+"\ntong cac chi so:"+nt1.tongcacchiso());
        System.out.println("HP:"+nt2.HP+"\nSpeed:"+nt2.speed+"\ndamage:"+nt2.damage+"\ntuoi:"+nt2.tuoi+"\ntong cac chi so"+nt2.tongcacchiso());

        //SieunhanVLTH sn1=new SieunhanVLTH();
        //SieunhanVLTH sn2=new SieunhanVLTH();
        //SieunhanVLTH sn3=new SieunhanVLTH();
        //SieunhanVLTH sn4=new SieunhanVLTH();


    }
}
