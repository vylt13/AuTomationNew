package testCaseFullVBDEN_LanhDao;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;
import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDaGiaiQuyet;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC05_VBDEN_ChiaSeHSCN extends ThuocTinhVBDen {
	WebDriver driver;
@Test
public void TGDTrinhLanhDao() throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBChoYKienLanhDao danhSachVBChoYkien = new DanhSachVBChoYKienLanhDao(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDenTatCa danhSachVBDenTatCa = new DanhSachVBDenTatCa(driver);
	FormXuLyVanBanDen formXuLyVanBanDen = new FormXuLyVanBanDen(driver);
	DanhSachVBDaGiaiQuyet danhSachVBDaGiaiQuyet = new DanhSachVBDaGiaiQuyet(driver);
	login.NavigateToSite();
	login.LoginUserVanThu();
	String trich_yeu = "[VTTest]- Lãnh đạo cho ý kiến văn bản đến và chia sẻ thêm HSCN lúc " + createdTime; 
	login.NavigateToNewInDocumentForm();
	iputVanBanDen.inputVanBanDen(
			sovb,
			so_van_ban, 
			trich_yeu ,
			loai_van_ban,
			co_quan_gui,
			linh_vuc,
			ngay_den,
			ngay_tren_vb,
			do_khan,
			do_mat,
			so_ban,
			so_trang,
			chon_lanh_dao_trinh_buoc_vthu);
	iputVanBanDen.uploadFile(filePath);
	iputVanBanDen.waitingForValidate();
	iputVanBanDen.chuyenXuLy();
	iputVanBanDen.waitingForLoading();
	login.signOut();

	//dang nhap vao user được trình
	
	login.NavigateToSite();
	login.LoginUserChuTich();
	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	login.LogReport();
	formXuLyVanBanDen.chiaSeVB(nguoi_duoc_chia_se_vb_den, y_kien_lanh_dao);
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.ThemHSDT();
	login.signOut();
	login.LoginUserCV2();
	danhSachViecCanXuLy.ValidateChiase(trich_yeu, lanh_dao_chu_tich);
	danhSachViecCanXuLy.ClickOnFirstItem();
	driver.quit();
	} 
}