package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThemMoiHSCN {
	WebDriver driver;

public ThemMoiHSCN(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// So van ban
By TieuDe = By.xpath("//input[contains(@id,'Field_Title')]");
By MoTa = By.xpath("//textarea[contains(@id,'Field_Description')]");
By ddTinhTrang = By.xpath("//select[contains(@id,'Field_Status')]");
By ddLoaiTaiLieu = By.xpath("//select[contains(@id,'Field_DocumentType')]");
By TienDo = By.xpath("(//input[@role='spinbutton'])[1]");
By TenTM = By.xpath("//input[@id='txtName']");
//Btn Tạo mới
By btnTaoMoi = By.xpath("//input[@value='Tạo mới']");
By btnXoa = By.xpath("//input[@id='btnDeleteDynamicGridDynamicManage']");
By btnThoat = By.xpath("//input[@id='btnThoat']");
//btn tạo thư mục
By btnTaoThuMuc = By.xpath("//input[@id='btnNewFolder']");
By btnLuu = By.xpath("//input[@id='btnSave']");
public void inputHSCN(
		String tieu_de,
		String mo_ta,
		String tinh_trang,
		String loai_tai_lieu
	) throws InterruptedException {
	
	driver.findElement(btnTaoMoi).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
// Nhap tiêu đề
	driver.findElement(TieuDe).sendKeys( tieu_de + System.currentTimeMillis());	
// Nhap Mô tả
	driver.findElement(MoTa).sendKeys( mo_ta);
// Chon Tình trạng
	Select tinhtrang = new Select(driver.findElement(ddTinhTrang));
	tinhtrang.selectByVisibleText(tinh_trang);
// Chon loại tài liệu
	Select loaitailieu = new Select(driver.findElement(ddLoaiTaiLieu));
	loaitailieu.selectByVisibleText(loai_tai_lieu);
// Nhap Mô tả
	//driver.findElement(TienDo).sendKeys( tien_do);
	driver.findElement(By.xpath("//input[@id='btnLuu']")).click();
	Thread.sleep(3000);
//validate
//	assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Không có mục nào')]")).getText(), "Không có mục nào");
	driver.findElement(By.xpath("//input[@id='btnLuu']")).click();
	driver.get(driver.getCurrentUrl());
}

public void waitingForLoading() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}

public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[1]")));
	driver.findElement(By.xpath("//tbody/tr[1]/td[1]//a")).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(btnTaoThuMuc).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(3);
	driver.findElement(TenTM).sendKeys("Tên thư mục");
	driver.findElement(btnLuu).click();
	driver.get(driver.getCurrentUrl());
	driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
	
//	assertEquals(driver.findElement(By.xpath("//td[2]")).getText(), "Tên thư mục");
	
}
public void XoaHSCN() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).click();
	driver.findElement(btnXoa).click();
	driver.switchTo().alert().accept();
	
	
}
public void Thoat() throws InterruptedException {
	driver.findElement(btnThoat).click();
	Thread.sleep(3000);
}
}
