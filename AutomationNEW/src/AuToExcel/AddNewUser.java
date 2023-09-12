package AuToExcel;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;

public class AddNewUser {
	WebDriver driver;
	@BeforeTest
	public void KhoiTaoTrinhDuyet(){
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	}
	@Test
	public void TaoMoiUser() throws InterruptedException, EncryptedDocumentException, IOException, ParseException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginNeW login = new LoginNeW(driver);
		FormThemMoiUserNew taoFormNew = new FormThemMoiUserNew(driver);
		login.NavigateToSite();
		login.LoginUserAdmin();
		for (int Row =1; 1<70; Row++) {
		taoFormNew.inputUser(Row);
}
}
}
