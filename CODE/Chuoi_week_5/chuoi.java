package com.company;

import java.util.Scanner;

public class chuoi {

    public static void main(String[] args) {
        String s1 = new String("012345abc67d89");
        //System.out.println(s1.replace("012345abc67d89", "0123456789")); //c1 thay thế chuỗi
        int i;
        for(i=0;i<s1.length();i++)
        {
            if(s1.codePointAt(i)>47 && s1.codePointAt(i)<58)
            System.out.print(s1.charAt(i));
        }
    }
}