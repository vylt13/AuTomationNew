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
import pages.ThemMoiHSCN;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;
import pages.ThuocTinhHSCN;

public class TC06_VBDEN_TaoHSCNTUMENU extends ThuocTinhHSCN {
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
	ThemMoiHSCN themMoiHSCN = new ThemMoiHSCN(driver);
	login.NavigateToSite();
	login.LoginUserVanThu();
	String trich_yeu = "[VTTest]- Tạo HSCN từ menu lúc " + createdTime; 
	login.NavigateToHSCN();
	themMoiHSCN.inputHSCN(
				trich_yeu ,
				mo_ta ,
				tinh_trang,
				loai_tai_lieu
				);
	iputVanBanDen.waitingForLoading();
	login.NavigateToHSCN();
	themMoiHSCN.ClickOnFirstItem();
	login.NavigateToHSCN();
	themMoiHSCN.XoaHSCN();
	driver.quit();
	} 
}