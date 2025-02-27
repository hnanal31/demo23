package bai3Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class AutomationTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // Sử dụng biến toàn cục, không khai báo lại
        driver.manage().window().maximize();
        driver.get("https://vitimex.com.vn/");
    }

    @Test
    public void testTimKiemSanPhamVaThemVaoGioHang() {
        // Tìm và nhập từ khóa vào ô tìm kiếm
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']")); // Sửa selector đúng
        searchBox.sendKeys("áo");
        searchBox.submit();

        // Đợi 2 giây (nên dùng WebDriverWait thay vì sleep)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Chọn sản phẩm đầu tiên
        WebElement firstProduct = driver.findElement(By.cssSelector(".product-item a"));
        firstProduct.click();

        // Thêm vào giỏ hàng
        WebElement addToCartButton = driver.findElement(By.cssSelector(".add-to-cart"));
        addToCartButton.click();

        // Kiểm tra số lượng giỏ hàng
        WebElement cartCount = driver.findElement(By.cssSelector(".cart-count"));
        String cartText = cartCount.getText().trim();
        assertFalse(cartText.isEmpty(), "Giỏ hàng trống!");
        assertTrue(Integer.parseInt(cartText) > 0);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit(); // Kiểm tra null trước khi đóng
        }
    }
}
