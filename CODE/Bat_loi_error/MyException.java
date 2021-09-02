
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

class MyException extends Exception{
    private int Message;
    MyException(int a){
        System.out.println("tren 50 tu trong file, vui long sưa lai!!!");
    }
    public static int NumberOfWordsFromFile(File F) throws MyException{
        int n = 0;
        String temp = "";
        ArrayList<String> TempArr = new ArrayList<>();

        try {
            FileReader FR = new FileReader(F);
            BufferedReader BR = new BufferedReader(FR);
            int i;
            while ((i = BR.read()) != -1) {
                char t = (char) i;
                if (t != ' ' && t != '\n') {
                    temp += t;
                } else {
                    n++;
                    TempArr.add(temp);
                    temp = "";
                }
            }
            BR.close();
            FR.close();

        } catch (Exception e) {
            System.out.println(e);
        }
//        for (String w:TempArr) {
//            System.out.println(w);
//        }
        if (n > 50) throw new MyException(n);
        return n;
    }

    public static void main(String[] args){
        File F = new File("C:\\Users\\DELL\\IdeaProjects\\javabuoi7.txt");
        try {
            int NW = NumberOfWordsFromFile(F);
            System.out.println("so tu tong cong la: " + NW);

        } catch (MyException e) {
            System.out.println("caught " + e);
        }
    }
}
