package Btvn_tuan6;

import java.util.*; //Arraylist cần khai báo java.util.*
import java.io.*;

public class ReadFileAndHashMap
{
    public static void main(String srgs[])throws Exception
    {
        int i;
        String temp = ""; //chuỗi trống
        boolean checkword = false;  //checkword sai
        Map<String, Integer> Count = new HashMap<String, Integer>(); //Map là bộ sưu tập không có thứ tự
        //! them dia chi cua file input vao
        FileReader readfile = new FileReader("C:\\Users\\DELL\\IdeaProjects\\hashMap\\Nhat_read_file.txt");
        while ((i=readfile.read()) != -1){   //nếu =-1 thì trong file không chứa từ vì vậy phải !=-1
            if (((char) i >= 'a' && (char) i <= 'z') || ((char) i >= 'A' && (char) i <= 'Z')){
                temp = temp + (char) i;
                checkword = true;
            }
            else{
                if (checkword == true )
                {
                    if (Count.containsKey(temp) == false)
                    {
                        Count.put(temp, 1);
                    }
                    else
                    {
                        Count.put(temp, Count.get(temp) + 1);
                    }
                    temp = "";
                    checkword = false;
                }
            }
        }
        Set<String> word = Count.keySet();
        Iterator<String> itr = word.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("word: " + key + " ~ so tu: " + Count.get(key));
        }
    }
}