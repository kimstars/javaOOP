package com.company;

public class Sach {
    public static int maSach;
    public static String ten;
    public static TacGia tacGia;
    public static int gia;
    public static int soTrang;


    public Sach(int maSach, String ten, TacGia tacGia, int gia, int soTrang){
        this.maSach = maSach;
        this.ten = ten;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
    }

    public static void setMaSach(int maSach) {
        Sach.maSach = maSach;
    }

    public static int getMaSach() {
        return maSach;
    }

    public static void setTen(String ten) {
        Sach.ten = ten;
    }

    public static String getTen() {
        return ten;
    }

    public static void setTacGia(TacGia tacGia) {
        Sach.tacGia = tacGia;
    }

    public static TacGia getTacGia() {
        return tacGia;
    }

    public static void setGia(int gia) {
        Sach.gia = gia;
    }

    public static int getGia() {
        return gia;
    }

    public static void setSoTrang(int soTrang) {
        Sach.soTrang = soTrang;
    }

    public static int getSoTrang() {
        return soTrang;
    }

    @Override
    public String toString(){
        return "Mã sách : "+ this.maSach + ". Tên sách : '" + this.ten + "'. Số trang : " + this.soTrang + "\n"
                +"Thông tin tác giả : "+ tacGia.toString();
    }
}
