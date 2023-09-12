package pages;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThuocTinhUyQuyen {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:ss");
	DateTimeFormatter formatNgayVanBan = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String createdTime = myFormatObj.format(LocalDateTime.now());
	public String nguoi_duoc_uy_quyen = "eoff.kv1.cv2";
	public String mo_ta = "Mô tả ủy quyền task văn bản";
	public String ngay_hieu_luc =formatNgayVanBan.format(LocalDateTime.now());
	public String han_hoan_tat =formatNgayVanBan.format(LocalDateTime.now());
	public String nguoi_uy_quyen ="Eoff Giám đốc";
	public String ten_nguoi_dc_uy_quyen ="Eoff Chuyên viên 2";
	public String ten_nguoi_bld ="Eoff Giám đốc";
	

}
