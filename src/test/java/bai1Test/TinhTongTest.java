package bai1Test;

import com.example.ThiThu01_KiemThu.bai1.TinhTong;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TinhTongTest {
    @Test
    public void testTinhTongTu1DenN_HopLe() {
        // n = 1 Biên nhỏ nhất
        assertEquals(1, TinhTong.tinhTongTu1DenN(1));

        // n = 2, n = 10 ( giá trị ngẫu nhiên)
        assertEquals(3, TinhTong.tinhTongTu1DenN(2));
        assertEquals(55, TinhTong.tinhTongTu1DenN(10));

    }

    @Test
    public void testTinhTongTu1DenN_GiaTriBien() {
        //Với n = 100 ( 1 gtri lớn hơn để xác nhận tính đúng của công thức)
        assertEquals(5050, TinhTong.tinhTongTu1DenN(100));
    }

    @Test
    void testTinhTongTuMotDenN_KhongHopLe() {
        // Ktra n = 0 -> chương trình ném ra ngoại lệ IllegalArgumentException
        // Dùng assertThrows() để xác nhận ngoại lệ có xảy ra và nội dung thông báo lỗi đúng với mong đợi.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TinhTong.tinhTongTu1DenN(0));
        assertEquals("n phải >= 1", exception.getMessage());
    }
}
