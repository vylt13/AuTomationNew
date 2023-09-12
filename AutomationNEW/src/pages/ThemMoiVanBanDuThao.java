package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThemMoiVanBanDuThao {
	WebDriver driver;
	String file01 = "C:\\AttachFiles\\FileWord.docx";
	String file02 = "C:\\AttachFiles\\FilePdf.pdf";
	String newformUrl = "https://daotaoeoffice.petrolimex.com.vn/ptcdn/vanban/SitePages/VanBanDi_New.aspx?Field=Workflow|Status&FieldValue=8|So%E1%BA%A1n%20th%E1%BA%A3o";
	String urlAfterCloseForm = "https://daotaoeoffice.petrolimex.com.vn/ptcdn/vanban/VanBanDi/Forms/AllItems.aspx";
public ThemMoiVanBanDuThao(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Trich yeu
By trichYeu = By.id("TxtTrichYeu");
// Upload file 01
By upload = By.id("FileAttachmentUpload1");
// Them moi 01 dong Upload file
By uploadMore01 = By.id("AddAttachImg01");
// Upload file 02 
By upload02 = By.id("FileAttachmentUpload2");
// Button Gui
By submitBtn = By.xpath("//span[@class='SaveButton']//input[@value='Tiếp tục']");
// Button Thoát
By closeBtn = By.xpath("//span[@class='CloseButton']//input[@value='Thoát']") ; 
// Button SigOut
By signOutBtn = By.id("ulmnSetting");
//icon Loading
By loadingIcon = By.id("divLoading");
// Box ý kiến trình
By txtYKT = By.id("TxtComment");
// Ten MIG 
By TenMIG = By.xpath("//input[contains(@id,'onetidIOFile')]");
//Trich yeu MIG 
By TrichYeuMIG = By.xpath("//textarea[contains(@id,'TrichYeu')]");
// Thực hiện Action Form
public void inputVanBanDuThao(
		String trich_yeu,
		String loai_van_ban) {
	driver.findElement(trichYeu).sendKeys(trich_yeu);
	Select selectLoaiVanBan = new Select(driver.findElement(By.id("DDLLoaiVanBan")));
	selectLoaiVanBan.selectByVisibleText(loai_van_ban);
	driver.findElement(txtYKT).sendKeys("Ý kiến trình phê duyệt");
}
public void inputVBDTMIG(
		String ten,
		String trich_yeu,
		String loai_van_ban) {
	driver.findElement(TenMIG).sendKeys(ten);
	driver.findElement(TrichYeuMIG).sendKeys(trich_yeu);
	Select selectLoaiVanBan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlLoaiVanBan')]")));
	selectLoaiVanBan.selectByVisibleText(loai_van_ban);

}
public void ChonKyThuaLenh() {
	driver.findElement(By.id("IsDelegateval")).click();
}
public void UploadFile(
		String filepath) {
	driver.findElement(upload).sendKeys(filepath);
}
public void submitForm() {
	driver.findElement(submitBtn).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
}
public void CloseForm() {
	driver.findElement(closeBtn).click();
}
public void ValidateCloseForm() {
	assertEquals(driver.getCurrentUrl(), urlAfterCloseForm);	
}
}
