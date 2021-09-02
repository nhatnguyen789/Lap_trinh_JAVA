package com.company;

public class Vuong extends ChuNhat {
    float canh;
    public Vuong(float canh) {
        super(canh, canh);
        this.canh=canh;
    }
    @Override
    public String toString() {
        return "Vuong [canh=" + canh + ", getChuVi()=" + getChuVi() + ", getDienTich()=" + getDienTich() + "]";
    }
}
