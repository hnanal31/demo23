package bai2Test;

import com.example.ThiThu01_KiemThu.bai2.SanPham;
import com.example.ThiThu01_KiemThu.bai2.SanPhamService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SanPhamTest {
    @Test
    void testThemSanPham() {
        SanPhamService service = new SanPhamService();
        SanPham sp = new SanPham("SP01", "Điện thoại", 2025, 3000, 28, "Còn hàng");
        service.themSanPham(sp);
        assertTrue(service.kiemTraTonTai("SP01"));
    }

    @Test
    void testXoaSanPham() {
        SanPhamService service = new SanPhamService();
        SanPham sp = new SanPham("SP02", "Laptop", 2026, 1000, 30, "Hết hàng");
        service.themSanPham(sp);
        assertTrue(service.xoaSanPham("SP02"));
        assertFalse(service.kiemTraTonTai("SP02"));
    }

    @Test
    void testKiemTraTonTai() {
        SanPhamService service = new SanPhamService();
        SanPham sp = new SanPham("SP03", "Máy tính bảng", 2025, 4000, 25, "Còn hàng");
        service.themSanPham(sp);
        assertTrue(service.kiemTraTonTai("SP03"));
        assertFalse(service.kiemTraTonTai("SP99"));
    }
}
