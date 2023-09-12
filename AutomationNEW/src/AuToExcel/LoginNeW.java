package AuToExcel;
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

public class LoginNeW {
	WebDriver driver;
	String tapDoanUrl = "https://eoffice.petrolimex.com.vn/";
	String baseUrl = "https://eoffice.petrolimex.com.vn/plxbp";
public LoginNeW(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Tieu de form
By userNameField = By.id("ctl00_PlaceHolderMain_signInControl_UserName");
// Trich yeu
By passwordField = By.id("ctl00_PlaceHolderMain_signInControl_password");
// Button LoginN
By loginBtn = By.id("ctl00_PlaceHolderMain_signInControl_login");
// Sign out
By signOutBtn = By.id("ulmnSetting");

// Truy cap site
public void NavigateToSite() {
	driver.get(baseUrl);
}
public void signOut() {
	driver.findElement(signOutBtn).click();
	driver.manage().deleteAllCookies();
	driver.get(baseUrl);

}
public void LoginUserAdmin() throws EncryptedDocumentException, IOException {
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\Account Petro site.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("Sheet2");
	WebDriverWait wait = new WebDriverWait(driver, 90);
	String Accountadmin = sheet.getRow(1).getCell(0).getStringCellValue();
	String Passadmin = sheet.getRow(1).getCell(1).getStringCellValue();
	driver.findElement(userNameField).sendKeys(Accountadmin);
	driver.findElement(passwordField).sendKeys(Passadmin);
	driver.findElement(loginBtn).click();
	
}
}
