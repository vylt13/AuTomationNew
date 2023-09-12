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

public class Login2 {
	WebDriver driver;
	String tapDoanUrl = "https://eoffice.petrolimex.com.vn/";
	String baseUrl = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/";
	String baseUrl1 = "https://eoffice.petrolimex.com.vn/plxbth/";
	String userKhoiTaoVBKhongKySo = "eoff.tn.cv1"; String pwUserKhoiTao = "vtpt@2023";
	String userKhoiTaoHSLT = "eoff.tn.cv1"; String pwUserKhoiTaoHSLT = "vtpt@2023";
	String userChahnn = "eoff.tn.tp"; String pwUserChahnn = "vtpt@2023";
	String userPheDuyet = "eoff.tn.ct"; String pwUserPheDuyet = "vtpt@2023";
	String userVanThu = "eoff.tn.vthu"; String pwUserVanThu = "vtpt@2023";
	String userChuTich = "eoff.tn.ct"; String pwUserChuTich = "vtpt@2023";
	String userTgd = "eoff.tn.gd"; String pwUserTgd = "vtpt@2023";
	String userTphongThucHien = "eoff.tn.tp"; String pwUserTphongThucHien ="vtpt@2023";
	String userASS = "eoff.tn.pp"; String pwuserASS ="vtpt@2023";
	String userTphongPheDuyet = "eoff.tn.tp"; String pwUserTphongPheDuyet ="vtpt@2023";
	String userNvienThucHien ="eoff.tn.cv1"; String pwNvienThucHien ="vtpt@2023";
	String userDuocChiaSeVBDen = "eoff.tn.cv1"; String pwUserDuocChiaSeVBDen = "vtpt@2023";
	String userDuocChuyenXuLy = "eoff.tn.cv2"; String pwUserDuocChuyenXuly = "vtpt@2023";
	String userVanThuPlxhnn = "eoff.tn.vthu"; String pwUserVanThuPlxhnn = "vtpt@2023";
	String userVanThuB12 = "eoff.b12.vthu"; String pwUserVanThuB12 = "vtpt@2023";
	String userNhanVbBanHanh = "eoff.tn.cv2"; String pwUserNhanVbBanHanh = "vtpt@2023";
	String userTrongGroupNhanVbBanHanh = "eoff.tn.tp"; String pwUserTrongGroupNhanVbBanHanh = "vtpt@2023";
	String userKhoiTaoVBKySo = "eoff.tn.cv1"; String pwUserKhoiTaoVBKySo = "vtpt@2023";
	String userKhoiTaoVBKySoCoWN = "eoff.tn.cv2"; String pwUserKhoiTaoVBKySoCoWN = "vtpt@2023";
	String userKhoiTaoHSTL = "eoff.tn.cv2"; String pwUserKhoiTaoHSTL = "vtpt@2023";
	String userPheDuyetHSTL = "eoff.tn.ct"; String pwUserPheDuyetHSTL = "vtpt@2023";
	String userCapNhatHSLT = "eoff.tn.cv2"; String pwUserCapNhatHSLT = "123456";
	String userXuLyVB2 = "eoff.tn.cv2"; String pwUserXuLyVB2 = "vtpt@2023";
	String userAdmin ="adminsp"; String pwUserAdmin = "qtplx@!!@@##";
	String userTpLienQuan = "eoff.tn.tphc"; String pwUserTpLienQuan = "vtpt@2023";
	String userLdDongPheDuyet = "eoff.tn.pgd"; String pwUserLdDongPheDuyet = "vtpt@2023";
 	String passWord = "vtpt@2023";
public Login2(WebDriver driver) {
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
public void NavigateToSite() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("Sheet2");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String BaseURL = sheet.getRow(1).getCell(0).getStringCellValue();
	driver.get(BaseURL);
}
public void NavigateToSiteTD() {
	driver.get(tapDoanUrl);
}
// Truy cap form
public void NavigateToNewInDocumentForm() {
//	driver.get(inDocumentNewFormUrl);	
	driver.get(baseUrl + "vanban/SitePages/VanBanDen/VanBanDenNew.aspx");
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
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi không ký số')]")).click();
}
public void NavigateToThemMoiVbKySo() throws InterruptedException {
	//driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
	//driver.findElement(By.xpath("//ul[@class='visible']//span[@class='title'][contains(text(),'Thêm mới')]")).click();
	driver.get(baseUrl + "/vanban/Sitepages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi có ký số')]")).click();
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
public void inputUserPass (String user, String password) {
	driver.findElement(userNameField).sendKeys(user);
	driver.findElement(passwordField).sendKeys(password);
	driver.findElement(loginBtn).click();
}
public void LoginNhanVienKhoiTao() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoHSLT);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoHSLT);
	driver.findElement(loginBtn).click();
}
public void LoginNhanVienKhoiTaoKySo() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoVBKySo);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoVBKySo);
	driver.findElement(loginBtn).click();
}
public void LoginNhanVienKhoiTaoKySoCoWN() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoVBKySoCoWN);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoVBKySoCoWN);
	driver.findElement(loginBtn).click();
}
public void LoginUserChahnn() {
	driver.findElement(userNameField).sendKeys(userChahnn);
	driver.findElement(passwordField).sendKeys(pwUserChahnn);
	driver.findElement(loginBtn).click();
}
public void LoginUserPheDuyet() {
	driver.findElement(userNameField).sendKeys(userPheDuyet);
	driver.findElement(passwordField).sendKeys(pwUserPheDuyet);
	driver.findElement(loginBtn).click();
}
public void LoginUserDuocChuyenXuLy() {
	driver.findElement(userNameField).sendKeys(userDuocChuyenXuLy);
	driver.findElement(passwordField).sendKeys(pwUserDuocChuyenXuly);
	driver.findElement(loginBtn).click();
}
public void LoginUserAss() {
	driver.findElement(userNameField).sendKeys(userASS);
	driver.findElement(passwordField).sendKeys(pwuserASS);
	driver.findElement(loginBtn).click();
}
public void LoginUserChuTich() {
	driver.findElement(userNameField).sendKeys(userChuTich);
	driver.findElement(passwordField).sendKeys(pwUserChuTich);
	driver.findElement(loginBtn).click();
}
public void LoginUserVanThu() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("Sheet2");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String AccountVanThu = sheet.getRow(1).getCell(0).getStringCellValue();
	String PassVanThu = sheet.getRow(2).getCell(1).getStringCellValue();
	driver.findElement(userNameField).sendKeys(AccountVanThu);
	driver.findElement(passwordField).sendKeys(PassVanThu);
	driver.findElement(loginBtn).click();
}
public void LoginUserTgd() {
	driver.findElement(userNameField).sendKeys(userTgd);
	driver.findElement(passwordField).sendKeys(pwUserTgd);
	driver.findElement(loginBtn).click();
}
public void LoginVanThuTD() {
	driver.findElement(userNameField).sendKeys("eoff.vthu");
	driver.findElement(passwordField).sendKeys("123321");
	driver.findElement(loginBtn).click();
}
public void LoginVanThuPlxhnn() {
	driver.findElement(userNameField).sendKeys(userVanThuPlxhnn);
	driver.findElement(passwordField).sendKeys(pwUserVanThuPlxhnn);
	driver.findElement(loginBtn).click();
}
public void LoginVanThuB12() {
	driver.findElement(userNameField).sendKeys(userVanThuB12);
	driver.findElement(passwordField).sendKeys(pwUserVanThuB12);
	driver.findElement(loginBtn).click();
}
public void LoginUserDuocChiaSeVBDen() {
	driver.findElement(userNameField).sendKeys(userDuocChiaSeVBDen);
	driver.findElement(passwordField).sendKeys(pwUserDuocChiaSeVBDen);
	driver.findElement(loginBtn).click();
}
public void LoginTphongThucHien() {
	driver.findElement(userNameField).sendKeys(userTphongThucHien);
	driver.findElement(passwordField).sendKeys(pwUserTphongThucHien);
	driver.findElement(loginBtn).click();
}
public void LoginTruongPhongPheDuyetVbDuThao() {
	driver.findElement(userNameField).sendKeys(userTphongPheDuyet);
	driver.findElement(passwordField).sendKeys(pwUserTphongPheDuyet);
	driver.findElement(loginBtn).click();
}
public void LoginNvienThucHien() {
	driver.findElement(userNameField).sendKeys(userNvienThucHien);
	driver.findElement(passwordField).sendKeys(pwNvienThucHien);
	driver.findElement(loginBtn).click();
}
public void LoginUser(
		String user) {
	driver.findElement(userNameField).sendKeys(user);
	driver.findElement(passwordField).sendKeys(passWord);
	driver.findElement(loginBtn).click();
}

public void LoginUserNhanVanBanBanHanh() {
	driver.findElement(userNameField).sendKeys(userNhanVbBanHanh);
	driver.findElement(passwordField).sendKeys(pwUserNhanVbBanHanh);
	driver.findElement(loginBtn).click();
}
public void LoginUserTrongGroupNhanVBBanHanh() {
	driver.findElement(userNameField).sendKeys(userTrongGroupNhanVbBanHanh);
	driver.findElement(passwordField).sendKeys(pwUserTrongGroupNhanVbBanHanh);
	driver.findElement(loginBtn).click();
}
public void signOut() {
	driver.findElement(signOutBtn).click();
	driver.manage().deleteAllCookies();
	driver.get(baseUrl);

}
public void LoginUserTaoHSTL() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoHSTL);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoHSTL);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserPheDuyetHSTL() {
	driver.findElement(userNameField).sendKeys(userPheDuyetHSTL);
	driver.findElement(passwordField).sendKeys(pwUserPheDuyetHSTL);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserXuLyVb2() {
	driver.findElement(userNameField).sendKeys(userXuLyVB2);
	driver.findElement(passwordField).sendKeys(pwUserXuLyVB2);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserAdmin() {
	driver.findElement(userNameField).sendKeys(userAdmin);
	driver.findElement(passwordField).sendKeys(pwUserAdmin);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserTpLienQuan() {
	driver.findElement(userNameField).sendKeys(userTpLienQuan);
	driver.findElement(passwordField).sendKeys(pwUserTpLienQuan);
	driver.findElement(loginBtn).click();
}
public void LoginUserLdDongPheDuyet() {
	driver.findElement(userNameField).sendKeys(userLdDongPheDuyet);
	driver.findElement(passwordField).sendKeys(pwUserLdDongPheDuyet);
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
public void LoginUserCapNhatHSLT() {
	// TODO Auto-generated method stub
	driver.findElement(userNameField).sendKeys(userCapNhatHSLT);
	driver.findElement(passwordField).sendKeys(pwUserCapNhatHSLT);
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
