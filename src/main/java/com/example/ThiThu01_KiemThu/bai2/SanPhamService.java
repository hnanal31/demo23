package com.example.ThiThu01_KiemThu.bai2;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> listSanPham = new ArrayList<>();

    public void themSanPham(SanPham sp) {
        listSanPham.add(sp);
    }

    public boolean xoaSanPham(String ma) {
        return listSanPham.removeIf(sp -> sp.getMa().equals(ma));
    }

    public boolean kiemTraTonTai(String maSanPham) {
        return listSanPham.stream().anyMatch(sp -> sp.getMa().equals(maSanPham));
    }
}
