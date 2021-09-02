package bt2;

import java.util.List;
import  java.util.ArrayList;

public class QuanLyTaiLieu {
    List<TaiLieu> documents;

    public QuanLyTaiLieu()
    {
        this.documents = new ArrayList<>();
    }

    public void addTaiLieu(TaiLieu document)
    {
        this.documents.add(document);
    }

    public boolean xoaTaiLieu(String maTaiLieu)
    {
        TaiLieu doc = this.documents.stream().filter(document -> document.getMaTaiLieu().equals(maTaiLieu)).findFirst().orElse(null);
        if(doc == null)
        {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    public void showInfor()
    {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }

    public void searchSach()
    {
        this.documents.stream().filter(doc -> doc instanceof Sach).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchBao()
    {
        this.documents.stream().filter(doc -> doc instanceof Bao).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchTapChi()
    {
        this.documents.stream().filter(doc -> doc instanceof TapChi).forEach(doc -> System.out.println(doc.toString()));
    }
}
