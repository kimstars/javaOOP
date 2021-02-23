package com.company;

public class Main {

    public static void main(String[] args) {
        TacGia tg = new TacGia(01, "Chu Tuấn Kiệt", "chutuankiet@gmail.com" , "chưa có ny");
        Sach sach1 = new Sach(01, "Club is the best place", tg, 10000, 1000);
        System.out.println(sach1.toString());
    }
}
