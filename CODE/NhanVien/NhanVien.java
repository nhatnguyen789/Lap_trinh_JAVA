package com.company;

import java.util.Scanner;

public class NhanVien {
    int id;
    String Name;
    String password;

    public NhanVien() {
    }

    public void Input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ten nhan vien : ");
        this.Name = scanner.nextLine();

        System.out.print("nhap password (vui long chi nhap chu va so) : ");
        this.password = scanner.nextLine();
    }
    public String toString(){
        return "Ten: " + this.Name + "\n" + "Password: " + this.password;
    }
    boolean IsSignUp(String name,String pass){
        if (this.Name.equals(name) && this.password.equals(pass))
            return true;
        else
        return false;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public NhanVien(int id,String Name,String password)
    {
        this.id=id;
        this.Name=Name;
        this.password=password;
    }
}
