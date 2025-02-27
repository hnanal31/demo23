package com.example.ThiThu01_KiemThu.bai1;

public class TinhTong {
    public static int tinhTongTu1DenN(int n) {
        // S = ( n * (n+1))/2
        //Nếu n < 1 sẽ ném ra ngoại lệ IllegalArgumentException vì ko có tổng của các số < 1
        if (n < 1) throw new IllegalArgumentException("n phải >= 1");
        return n * (n + 1) / 2;
    }
}
