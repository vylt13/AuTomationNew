package pages;


import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachUyQuyenTatCa {
	WebDriver driver;
	
public DanhSachUyQuyenTatCa(WebDriver driver) {
	this.driver = driver;
}
// Task VB
By uyquyentasknuy = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[1]");
By uyquyentasknduy = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[2]");
By uyquyentasknhl = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[3]");
By uyquyentaskhht = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[4]");
By uyquyenduocuyquyentasknuy = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[1]");
By uyquyenduocuyquyentasknduy = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[2]");
By uyquyenduocuyquyentasknhl = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[3]");
By uyquyenduocuyquyentaskhht = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[4]");
By xoa = By.xpath("//div[@id='ctl00_ctl47_g_ee5cbfc8_c0f7_4838_8e89_014a666a2502']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]//span[@class='icon icon-delete']");
// Van ban den 
By uyquyenvbdennuy = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[1]");
By uyquyenvbdennduy = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[2]");
By uyquyenvbdennhl = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[3]");
By uyquyenvbdenhht = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[4]");
By uyquyenvbdenbld = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[6]");
By uyquyenduocuyquyenvbdennuy = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[1]");
By uyquyenduocuyquyenvbdennduy = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[2]");
By uyquyenduocuyquyenvbdennhl = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[3]");
By uyquyenduocuyquyenvbdenhht = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[4]");
By xoa2 = By.xpath("//div[@id='ctl00_ctl47_g_e049ccf6_3cd0_4221_a51f_e120aae4b2b9']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]//span[@class='icon icon-delete']");
//Van ban di 
By uyquyenvbdinuy = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[1]");
By uyquyenvbdinduy = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[2]");
By uyquyenvbdinhl = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[3]");
By uyquyenvbdihht = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[4]");
By uyquyenvbdibld = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c']//div[@class='Form-grid']//*[@id=\"tbUyQuyen\"]/tbody/tr[1]/td[6]");
By uyquyenduocuyquyenvbdinuy = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c_ctl00_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[1]");
By uyquyenduocuyquyenvbdinduy = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c_ct100_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[2]");
By uyquyenduocuyquyenvbdinhl = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c_ct100_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[3]");
By uyquyenduocuyquyenvbdihht = By.xpath("//div[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c_ct100_divDelegateDuocUyQuyen']//div[@class='Form-grid']//*[@id=\"tbDuocUyQuyen\"]/tbody/tr/td[4]");

By mota = By.xpath("//textarea[contains(@id,'txMoTa')]");
By nguoiuyquyen = By.xpath("//span[contains(@id, 'lbVNguoiUyQuyen')]");
By nguoiduocuyquyen = By.xpath("//input[contains(@id, 'cppNguoiXuLy_TopSpan_EditorInput')]");
By hanhoantat = By.xpath("//input[contains(@id, 'dtcHanHoanTatDate')]");
By ngayhieuluc = By.xpath("//input[contains(@id, 'dtcNgayBatDauDate')]");

public void validateDanhSachUQTaskVB(
		String nguoi_uy_quyen,
		String nguoi_duoc_uy_quyen,
		String ngay_hieu_luc,
		String han_hoan_tat
		) {
	assertEquals(driver.findElement(uyquyentasknuy).getText(),nguoi_uy_quyen);
	assertEquals(driver.findElement(uyquyentasknduy).getText(),nguoi_duoc_uy_quyen);
	assertEquals(driver.findElement(uyquyentasknhl).getText(),ngay_hieu_luc);
	assertEquals(driver.findElement(uyquyentaskhht).getText(),han_hoan_tat);

}
public void validateDanhSachUQTaskVBDuocUQ(
		String nguoi_uy_quyen,
		String nguoi_duoc_uy_quyen,
		String ngay_hieu_luc,
		String han_hoan_tat) {
	assertEquals(driver.findElement(uyquyenduocuyquyentasknuy).getText(),nguoi_uy_quyen);
	assertEquals(driver.findElement(uyquyenduocuyquyentasknduy).getText(),nguoi_duoc_uy_quyen);
	assertEquals(driver.findElement(uyquyenduocuyquyentasknhl).getText(),ngay_hieu_luc);
	assertEquals(driver.findElement(uyquyenduocuyquyentaskhht).getText(),han_hoan_tat);
}
public void validateDanhSachUQVBDen(
		String nguoi_uy_quyen,
		String nguoi_duoc_uy_quyen,
		String ngay_hieu_luc,
		String han_hoan_tat,
		String ban_lanh_dao) {
	assertEquals(driver.findElement(uyquyenvbdennuy).getText(),nguoi_uy_quyen);
	assertEquals(driver.findElement(uyquyenvbdennduy).getText(),nguoi_duoc_uy_quyen);
	assertEquals(driver.findElement(uyquyenvbdennhl).getText(),ngay_hieu_luc);
	assertEquals(driver.findElement(uyquyenvbdenhht).getText(),han_hoan_tat);
	assertEquals(driver.findElement(uyquyenvbdenbld).getText(),ban_lanh_dao);
}

public void validateDanhSachUQVBDenDuocUQ(
		String nguoi_uy_quyen,
		String nguoi_duoc_uy_quyen,
		String ngay_hieu_luc,
		String han_hoan_tat) {
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdennuy).getText(),nguoi_uy_quyen);
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdennduy).getText(),nguoi_duoc_uy_quyen);
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdennhl).getText(),ngay_hieu_luc);
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdenhht).getText(),han_hoan_tat);
}
public void validateDanhSachUQvbdi(
		String nguoi_uy_quyen,
		String nguoi_duoc_uy_quyen,
		String ngay_hieu_luc,
		String han_hoan_tat) {
	assertEquals(driver.findElement(uyquyenvbdinuy).getText(),nguoi_uy_quyen);
	assertEquals(driver.findElement(uyquyenvbdinduy).getText(),nguoi_duoc_uy_quyen);
	assertEquals(driver.findElement(uyquyenvbdinhl).getText(),ngay_hieu_luc);
	assertEquals(driver.findElement(uyquyenvbdihht).getText(),han_hoan_tat);
}

public void validateDanhSachUQvbdiDuocUQ(
		String nguoi_uy_quyen,
		String nguoi_duoc_uy_quyen,
		String ngay_hieu_luc,
		String han_hoan_tat) {
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdinuy).getText(),nguoi_uy_quyen);
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdinduy).getText(),nguoi_duoc_uy_quyen);
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdinhl).getText(),ngay_hieu_luc);
	assertEquals(driver.findElement(uyquyenduocuyquyenvbdihht).getText(),han_hoan_tat);
}
public void XoaUyQuyen() throws InterruptedException {
	driver.findElement(xoa).click();
	driver.switchTo().alert().accept();
	Thread.sleep(800);
}public void UyQuyenTaskVBTC(String mo_ta,
		String ngay_hoan_tat,
		String ngay_hieu_luc,
		String nguoi_duoc_uy_quyen) {
	driver.findElement(By.xpath("//input[@id='ctl00_ctl47_g_f4cad66a_ea12_4118_a5fe_49e9d9fa5e6c_ctl00_btDelegate']")).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(mota).sendKeys(mo_ta);
	driver.findElement(hanhoantat).sendKeys(ngay_hoan_tat);
	driver.findElement(ngayhieuluc).clear();
	driver.findElement(ngayhieuluc).sendKeys(ngay_hieu_luc);
	driver.findElement(nguoiduocuyquyen).sendKeys(nguoi_duoc_uy_quyen, Keys.TAB, Keys.ENTER);
}
}