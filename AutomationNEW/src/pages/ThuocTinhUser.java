package pages;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThuocTinhUser {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	DateTimeFormatter formatNgayVanBan = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String createdTime = myFormatObj.format(LocalDateTime.now());
	public String cv1 = "eoff.cnbt.cv1";
	public String cv2 = "eoff.cnbt.cv2";
	public String tphong = "eoff.cnbt.tp";
	public String gd = "eoff.cnbt.gd";
	public String ctich = "eoff.cnbt.ct";
	public String pgd = "eoff.cnbt.pgd";
	public String tphc = "eoff.cnbt.tphc";
	public String phophong = "eoff.cnbt.pp";
	public String phophonghc = "eoff.cnbt.pphc";
	public String vthu = "eoff.cnbt.vthu";
	public String hoten_cv1 = "Eoff Chuyên viên 1";
	public String hoten_cv2 = "Eoff Chuyên viên 2";
	public String hoten_ctich = "Eoff Chủ tịch";
	public String hoten_gd = "Eoff Giám đốc";
	public String hoten_vthu = "Eoff Văn thư";
	public String hoten_tp = "Eoff Trưởng phòng";
	public String hoten_pgd ="Eoff Phó Giám đốc";
	public String hoten_tphc ="Eoff TPHC";
	public String hoten_pp = "Eoff Phó phòng";
	public String hoten_pphc = "Eoff Phó phòng HC";
	public String kynhay1 = "C:\\AttachFiles\\Mẫu chữ ký\\Nháy\\annq_nhay.png";
	public String kySo1 = "C:\\AttachFiles\\Mẫu chữ ký\\Chính\\annq_chinh.png";
	public String kynhay2 = "C:\\AttachFiles\\Mẫu chữ ký\\Nháy\\hungnv_nhay.png";
	public String kySo2 = "C:\\AttachFiles\\Mẫu chữ ký\\Chính\\tutk_chinh.png";
	public String kynhay3 = "C:\\AttachFiles\\Mẫu chữ ký\\Nháy\\anhpd_nhay.png";
	public String kySo3 = "C:\\AttachFiles\\Mẫu chữ ký\\Chính\\anhpd_chinh.png";
		
	
}
