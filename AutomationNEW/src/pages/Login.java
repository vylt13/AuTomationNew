package pages;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Login {
	WebDriver driver;
	String tapDoanUrl = "https://eoffice.petrolimex.com.vn/";
	String baseUrl = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/";
	String baseUrl1 = "https://eoffice.petrolimex.com.vn/plxla/";
	String userASS = "eoff.tn.pp"; String pwuserASS ="vtpt@2023";
	String userTphongPheDuyet = "eoff.tn.tp"; String pwUserTphongPheDuyet ="vtpt@2023";
	String userDuocChuyenXuLy = "eoff.tn.cv2"; String pwUserDuocChuyenXuly = "vtpt@2023";

	String userAdmin ="adminsp"; String pwUserAdmin = "qtplx@!!@@##";
public Login(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Tieu de form
By userNameField = By.id("ctl00_PlaceHolderMain_signInControl_UserName");
// Trich yeu
By passwordField = By.id("ctl00_PlaceHolderMain_signInControl_password");
// Button Login
By loginBtn = By.id("ctl00_PlaceHolderMain_signInControl_login");
// Sign out
By signOutBtn = By.id("ulmnSetting");

// Truy cap site
public void NavigateToSite() {
	driver.get(baseUrl);
}
public void NavigateToSiteTD() {
	driver.get(tapDoanUrl);
}
// Truy cap form
public void NavigateToNewInDocumentForm() {
//	driver.get(inDocumentNewFormUrl);	
	driver.get(baseUrl + "vanban/SitePages/VanBanDen/VanBanDenNew.aspx");
//	driver.get(baseUrl + "vanban/Lists/VanBanDen/NewForm.aspx");
}
public void NavigateToHSCN() {	
	driver.get(baseUrl + "vanban/Lists/HoSoCongViec/AllItems.aspx");
}
public void NavigateToSoVBDI() {	
	driver.get(baseUrl1 + "vanban/Lists/SoVanBanDi/AllItems.aspx");
}
public void NavigateToSoVBDEN() {	
	driver.get(baseUrl1 + "vanban/Lists/SoVanBanDen/AllItems.aspx");
}
public void NavigateToBanLD() {	
	driver.get(baseUrl1 + "vanban/Lists/BanLanhDao/AllItems.aspx");
}
public void NavigateToNDKS() {	
	driver.get(baseUrl + "SitePages/WorkerSignature_List.aspx");
}
public void NavigatetoFomUQTaskVB() {
driver.get(baseUrl+ "vanban/SitePages/TaskDelegate.aspx");
}
public void NavigatetoDanhSachUyQuyen() {
driver.get(baseUrl+ "vanban/SitePages/Delegate.aspx");
}
public void NavigatetoFomUQVBDen() {
driver.get(baseUrl+ "vanban/Lists/DelegateBLD/NewForm.aspx");
}
public void NavigatetoFomUQVBDi() {
driver.get(baseUrl+ "vanban/Lists/Delegate/NewForm.aspx");
}
//	Truy cap danh sach VB Dang luu
public void NavigateToDanhSachVBDangLuu() {
//	driver.get(vanBanDenDangLuuUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='DynamicManage']//table//tbody//tr[1]")));
	driver.findElement(By.xpath("//span[contains(text(),'Đăng ký văn bản')]")).click();
//	driver.findElement(By.xpath("//span[contains(text(),'Đang lưu')]")).click();
	driver.get(baseUrl + "vanban/Sitepages/VanBanDen/Luu.aspx");
	
}
public void NavigatToVBChoYKienLanhdao() {
//	driver.get(vanBanDenChoYKienLanhnn.nbaoUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='DynamicManage']//table//tbody//tr[1]")));
	driver.findElement(By.xpath("//span[contains(text(),'Đang giải quyết')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Chờ ý kiến Lãnh đạo')]")).click();
}
public void NavigateToVBDangGiaiQuyet() {
	driver.findElement(By.xpath("//span[contains(text(),'Đang giải quyết')]")).click();
//driver.findElement(By.xpath("//span[contains(text(),'VB đang giải quyết')]")).click();
driver.get(baseUrl +"vanban/SitePages/VanBanDen/DangGiaiQuyet.aspx");

}
public void NavigateToTatCaVBDen() { 
//	driver.get(vanBanDenTatCaUrl);
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Tất cả')]"))));
	driver.findElement(By.xpath("//span[contains(text(),'Tất cả')]")).click();
}
public void NavigateToTrangChuVB() {
//	driver.get(trangChuVBUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[2]//span")));
	driver.findElement(By.xpath("//span[@class='menu-item-text'][contains(text(),'Văn bản')]")).click();
}
public void NavigateToVBDaGiaiQuyet() {
//	driver.get(vanBanDenDaGiaiQuyetUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='DynamicManage']//table//tbody//tr[1]")));
	driver.findElement(By.xpath("//span[contains(text(),'Đã giải quyết')]")).click();
}
public void NavigateToThemMoiVbDuThaoCu() throws InterruptedException {
	driver.get(baseUrl + "vanban/SitePages/VanBanDi_New.aspx?Field=Workflow|Status&FieldValue=8|Soạn%20thảo");
}
public void NavigateToThemMoiVbDuThaoKhongKySo() throws InterruptedException {
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
//	driver.get(baseUrl + "vanban/SitePages/VanBanDi_New.aspx?Field=Workflow|Status&FieldValue=8|Soạn%20thảo");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi không ký số')]")).click();
}
public void NavigateToThemMoiVbKySo() throws InterruptedException {
	//driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
	//driver.findElement(By.xpath("//ul[@class='visible']//span[@class='title'][contains(text(),'Thêm mới')]")).click();
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi có ký số')]")).click();
}
public void NavigateToThemMoiUser() throws InterruptedException {
	driver.get(baseUrl+"Lists/NhanVien/NewForm.aspx?");
	Thread.sleep(1500);
	//driver.findElement(By.xpath("//input[@value='Tạo mới']")).click();
}
public void NavigateToDanhSachVBDuThaoDangSoan() throws InterruptedException {
	driver.get(baseUrl + "/vanban/Sitepages/VanBanCuaToi/DangSoanThao.aspx");
//	driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
//	Thread.sleep(2000);
////	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Đang soạn thảo']")));
//	driver.findElement(By.xpath("//span[normalize-space()='Đang soạn thảo']")).click();
//	Thread.sleep(2000);
}
public void NavigateToDanhSachVBDuThaoChoPheDuyet() throws InterruptedException {
	driver.get(baseUrl + "/vanban/Sitepages/VanBanCuaToi/ChoPheDuyet.aspx");
//	driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Chờ phê duyệt')]")).click();
//	Thread.sleep(2000);
}
public void NavigateToDanhSachVbDuThaoDaPheDuyet() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Đã phê duyệt')]")).click();
	Thread.sleep(2000);
}
public void NavigateToDanhSachVanBanDiChoPheDuyet() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Chờ phê duyệt')]")).click();
	Thread.sleep(2000);
}
public void NavigateToDanhSachVanBanDiDaPheDuyet() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Đã phê duyệt')]")).click();
	Thread.sleep(2000);
}
public void NavigateToThemMoiVBBanHanh() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Ban hành']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@class,'visible')]//span[contains(@class,'title')][contains(text(),'Thêm mới')]")).click();
}
public void NavigateToDanhSachVbBanHanhDangLuu() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Ban hành']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@class,'visible')]//span[contains(@class,'title')][contains(text(),'Đang lưu')]")).click();
}
public void NavigateToVanBanDaPhatHanh() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Ban hành']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='has-sub opened']//span[contains(text(),'Đã ban hành')]")).click();
}
// Thực hiện Action Login
public void LoginCV1() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountCV1 = sheet.getRow(7).getCell(1).getStringCellValue();
	String PassCV1 = sheet.getRow(7).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountCV1);
	driver.findElement(passwordField).sendKeys(PassCV1);
	driver.findElement(loginBtn).click();
}

public void LoginUserPheDuyet() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountChuTich = sheet.getRow(2).getCell(1).getStringCellValue();
	String PassChuTich = sheet.getRow(2).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountChuTich);
	driver.findElement(passwordField).sendKeys(PassChuTich);
	driver.findElement(loginBtn).click();
}
public void LoginUserDuocChuyenXuLy() {
	driver.findElement(userNameField).sendKeys(userDuocChuyenXuLy);
	driver.findElement(passwordField).sendKeys(pwUserDuocChuyenXuly);
	driver.findElement(loginBtn).click();
}
public void LoginUserAss() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountPP= sheet.getRow(6).getCell(1).getStringCellValue();
	String PassPP = sheet.getRow(6).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountPP);
	driver.findElement(passwordField).sendKeys(PassPP);
	driver.findElement(loginBtn).click();
}
public void LoginUserChuTich() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountVanThu = sheet.getRow(2).getCell(1).getStringCellValue();
	String PassVanThu = sheet.getRow(2).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountVanThu);
	driver.findElement(passwordField).sendKeys(PassVanThu);
	driver.findElement(loginBtn).click();
}
public void LoginUserVanThu() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 20);
	String AccountVanThu = sheet.getRow(1).getCell(1).getStringCellValue();
	String PassVanThu = sheet.getRow(1).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountVanThu);
	driver.findElement(passwordField).sendKeys(PassVanThu);
	driver.findElement(loginBtn).click();
}
public void LoginUserTgd() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountTGD = sheet.getRow(3).getCell(1).getStringCellValue();
	String PassTGD = sheet.getRow(3).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountTGD);
	driver.findElement(passwordField).sendKeys(PassTGD);
	driver.findElement(loginBtn).click();
}
public void LoginTruongPhong() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountTp = sheet.getRow(5).getCell(1).getStringCellValue();
	String PassTp = sheet.getRow(5).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountTp);
	driver.findElement(passwordField).sendKeys(PassTp);
	driver.findElement(loginBtn).click();
}
public void signOut() {
	driver.findElement(signOutBtn).click();
	driver.manage().deleteAllCookies();
	driver.get(baseUrl);

}
public void LoginUserAdmin() {
	driver.findElement(userNameField).sendKeys(userAdmin);
	driver.findElement(passwordField).sendKeys(pwUserAdmin);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserTPHC() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountTPHC = sheet.getRow(9).getCell(1).getStringCellValue();
	String PassTPHC = sheet.getRow(9).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountTPHC);
	driver.findElement(passwordField).sendKeys(PassTPHC);
	driver.findElement(loginBtn).click();
}
public void LoginUserPGD() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountPGD = sheet.getRow(4).getCell(1).getStringCellValue();
	String PassPGD = sheet.getRow(4).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountPGD);
	driver.findElement(passwordField).sendKeys(PassPGD);
	driver.findElement(loginBtn).click();
}
public void NavigateToFormThemMoiHopDong() throws InterruptedException  {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Hợp đồng')]")).click();
	
}
public void NavigateToFormThemMoiBBThanhToan() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Biên bản thanh toán ')]")).click();
}
public void NavigateToFormThemMoiToTrinh() throws InterruptedException  {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Tờ trình ')]")).click();
}
public void NavigateToFormThemMoiBaoCaoNoiBo() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Báo cáo nội bộ')]")).click();
}
public void NavigateToFormThemMoiBienBanNoiBo() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Biên bản nội bộ')]")).click();
	
}
public void NavigateToFormThemMoiHstlKhac() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Hồ sơ tài liệu khác')]")).click();
}
public void NavigateToFormThemMoiHSLuuTru() throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(By.xpath("//span[contains(text(),'Hồ sơ lưu trữ')]")).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Thêm mới')]"))));
	driver.findElement(By.xpath("//span[contains(text(),'Thêm mới')]")).click();
}
public void NavigateToDanhSachHSLuuTru() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//span[contains(text(),'Hồ sơ lưu trữ')]")).click();
	Thread.sleep(1000);
	driver.get(baseUrl+"vanban/SitePages/HoSoLuuTru/DanhSachBoHoSo.aspx");
}
public void LoginUserCV2() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("User");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountCV2 = sheet.getRow(8).getCell(1).getStringCellValue();
	String PassCV2 = sheet.getRow(8).getCell(4).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountCV2);
	driver.findElement(passwordField).sendKeys(PassCV2);
	driver.findElement(loginBtn).click();
}
public void LogReport() {
	String urlForm = driver.getCurrentUrl();
	Reporter.log(urlForm);
//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
//	driver.switchTo().window(tabs.get(1)); 
}
public void KiemTraPageAcessDeny() {
	assertEquals(driver.getTitle(), "AccessDeny");
	assertEquals(driver.findElement(By.xpath("//div[@class='Message']//span[@class='Text']")).getText(), "Bạn không có quyền xem thông tin này.");
}
public int KiemTraSoLuongTak() {
	int valueSoLuongTask = Integer.parseInt(driver.findElement(By.id("numTasks")).getText());
	return valueSoLuongTask;
}
public void ValidatePhatSinhTask(
		int so_luong_tak_truoc,
		int so_luong_task_sau) {
	assertEquals(so_luong_task_sau - so_luong_tak_truoc, 1);
}
public void ValidateHoanTatTask(
		int so_luong_tak_truoc,
		int so_luong_task_sau) {
	assertEquals(so_luong_tak_truoc - so_luong_task_sau, 1);
}
public void NavigateToTatCaVBDi() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@class='visible']//span[normalize-space()='Tất cả']")).click();
}
public void NavigateToVBDenQuaMang() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='opened active ']//span[normalize-space()='Tất cả']")).click();
}
public void NavigatToVBChoYKienLanhDao() {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/Sitepages/VanBanDen/ChoYKienLanhDao.aspx");
}
}
