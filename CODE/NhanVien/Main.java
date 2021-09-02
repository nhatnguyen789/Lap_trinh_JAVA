package com.company;
import java.util.*;

public class Main {

    public static boolean  CheckPassword(String src)
    {
        String s1=src.replaceAll("^0-9"," ");
        String s2=src.replaceAll("^a-z"," ");
        if(s1.equals("")||s2.equals("")) {
            System.out.println("Password False!!! Please try again");
            return false;
        }
        else
            return true;
    }
    public static void AddEmployee(Map<String,NhanVien>Employee) {
        Scanner Scanner = new Scanner(System.in);
        NhanVien NV = new NhanVien();
        do {
            NV.Input();
        }
        while (!CheckPassword(NV.getPassword().toLowerCase()));
        {
            System.out.println("input ID: ");
            Employee.put(Scanner.nextLine(), NV);
        }
    }
    public static void SignUp(Map<String,NhanVien>Employee)
    {
        Scanner Scanner =new Scanner(System.in);
        NhanVien NV=new NhanVien();
        NV.Input();
        if(NV.Name.equals(NV.Name)&& NV.password.equals(NV.password))
        {
            System.out.println("Dang nhap thanh cong\n");
        }
        else
        {
            System.out.println("Dang nhap that bai\n");
        }
    }

    public static void FindEmployee(Map<String,NhanVien>Employee) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bat dau tim vui long nhap lai ID");
        System.out.print("ID");
        String tempID = Scanner.next();
        if (Employee.containsKey(tempID)) {
            System.out.println(Employee.get(tempID).toString());
        } else {
            System.out.println("Not found address ID:" + tempID);
        }
    }
    public static void Menu()
    {
        System.out.println("1.Add a new employee:");
        System.out.println("2.find employees:");
        System.out.println("3.Print employee list:");
        System.out.println("4.SIGN UP:");
        System.out.print("0.Exit");
        System.out.print("choice");
    }
    public static void main(String[] args)
    {
        Map<String,NhanVien> Employee= new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int c = 1;
        while (c != 0) {
            Menu();
            c = scanner.nextInt();
            if (c < 0 || c > 4)
            {
                System.out.println("this function doesn't exist yet or has not been update, please try again!!!@");
                Menu();
                c = scanner.nextInt();
            }
            switch (c) {
                case 1:
                    AddEmployee(Employee);
                    break;
                case 2:
                    FindEmployee(Employee);
                    break;
                case 3: {
                    Set<String> Keys = Employee.keySet();
                    Iterator<String> itr = Keys.iterator();
                    while (itr.hasNext()) {
                        String key = itr.next();
                        System.out.println(key + ": " + "\n" + Employee.get(key).toString());
                    }
                }
                case 4:
                    SignUp(Employee);
                    break;
                case 0:
                    System.out.println("..........Exit........");
                    System.exit(0);
            }
        }
    }
}
