package pages;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThuocTinhHSCN {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	DateTimeFormatter formatNgayVanBan = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String createdTime = myFormatObj.format(LocalDateTime.now());
	public String mo_ta = "Hồ sơ cá nhân _mô tả" + createdTime;
	public String loai_tai_lieu = "Cấp công ty";
	public String tinh_trang = "Đang tiến hành";
	public String tien_do_HS = "20";
	
}
