package pages;


import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UyQuyen {
	WebDriver driver;
	
public UyQuyen(WebDriver driver) {
	this.driver = driver;
}
By mota = By.xpath("//textarea[contains(@id,'txMoTa')]");
By nguoiuyquyen = By.xpath("//span[contains(@id, 'lbVNguoiUyQuyen')]");
By nguoiduocuyquyen = By.xpath("//input[contains(@id, 'cppNguoiXuLy_TopSpan_EditorInput')]");
By hanhoantat = By.xpath("//input[contains(@id, 'dtcHanHoanTatDate')]");
By ngayhieuluc = By.xpath("//input[contains(@id, 'dtcNgayBatDauDate')]");

public void validateformUQTaskVB(
		String nguoi_uy_quyen
		) {
	assertEquals(driver.findElement(nguoiuyquyen).getAttribute("textContent"), nguoi_uy_quyen);
}
public void TaoUyQuyenTaskVB(
		String mo_ta,
		String ngay_hoan_tat,
		String ngay_hieu_luc,
		String nguoi_duoc_uy_quyen) {
	driver.findElement(mota).sendKeys(mo_ta);
	driver.findElement(hanhoantat).sendKeys(ngay_hoan_tat);
	driver.findElement(ngayhieuluc).clear();
	driver.findElement(ngayhieuluc).sendKeys(ngay_hieu_luc);
	driver.findElement(nguoiduocuyquyen).sendKeys(nguoi_duoc_uy_quyen, Keys.TAB, Keys.ENTER);
	driver.findElement(By.xpath("//input[contains(@id, 'btSave')]")).click();
	
}

public void WaitionForLoading() {
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}

}
