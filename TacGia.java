package com.company;

public class TacGia {
    public static int  maTacGia;
    public static  String ten;
    public static String email;
    public static String thongtin;

    public TacGia(int maTacGia, String ten, String email, String thongtin){
        this.maTacGia = maTacGia;
        this.ten = ten;
        this.email = email;
        this.thongtin = thongtin;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public static String getTen() {
        return ten;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getEmail() {
        return email;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public static String getThongtin() {
        return thongtin;
    }
    @Override
    public String toString(){
        return "Tên tác giả : "+ this.ten + " - Email: "+ this.email + " - Thông tin: "+ thongtin;
    }
}
