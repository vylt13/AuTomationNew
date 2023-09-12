package pages;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThuocTinhVBBanHanh {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	DateTimeFormatter formatNgayVanBan = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String createdTime = myFormatObj.format(LocalDateTime.now());
	public String ngay_hieu_luc = formatNgayVanBan.format(LocalDateTime.now());
	public String ngay_ban_hanh = formatNgayVanBan.format(LocalDateTime.now());
	public String trich_yeu_du_thao_vb = "Trích yếu dự thảo Văn bản lúc: " + System.currentTimeMillis();
	public String file01 = "C:\\AttachFiles\\FileWord.docx";
	public String fileName01 = "FileWord.docx";
	public String file02 = "C:\\AttachFiles\\FilePdf.pdf";
	public String fileName02 = "FilePdf.pdf";
	public String file03 = "C:\\AttachFiles\\FileExcel.xlsx";
	public String fileName03 = "FileExcel.xlsx";
	public String loai_van_ban = "Nghị quyết";
	public String loai_van_ban_cap_nhat = "Biên bản";
	public String linh_vuc = "An toàn môi trường";
	public String do_khan = "Thượng khẩn";
	public String do_mat = "Tuyệt mật";
	public String so_ban = "5";
	public String so_trang = "12";
	public String nguoi_ky_vb = "Bùi Trọng Nghĩa";
	public String chuc_vu_nguoi_ky ="Phó Giám Đốc";
	public String nguoi_soan_thao = "eoff.kv3.cv1";
	public String van_thu = "Eoff Văn thư";
	public String lanh_dao_phong_ban = "Eoff Trưởng phòng";
	public String phong_ban_nguoi_tao = "Phòng Công nghệ Thông tin";
	public String lanh_dao_phong_dang_xu_ly = "PLXKV1-CNTT - Phong Cong nghe Thong tin - Manager";
	public String tinh_trang_lanh_dao_phong = "Trưởng phòng/ Trưởng ban";
	public String lanh_dao_bgd_dang_xu_ly = "Tổng giám đốc KV1";
	public String tinh_trang_bgd = "Ban TGĐ/HĐQT";
	public String lanh_dao_duyet_vb = "Tổng giám đốc KV1";
	public String nguoi_nhan_vb = "eoff.th.cv2";
	public String group_nhan_vb = "DUG - Don vi Upgrade";
	public String y_kien_nguoi_gui = "Ý kiến người soạn thảo gửi phê duyệt";
	public String nguoi_duoc_cs = "eoff.kv1.cv1";
	public String y_kien_phe_duyet_vb_du_thao = "Ý kiến phê duyệt VB Dự thảo";
	public String y_kien_lanh_dao_phan_cong_vb = "Lãnh đạo phân công thực hiện Văn bản ban hành";
	public String y_kien_nguoi_nhan = "Người nhận cập nhật Ý kiến khi xử lý Task Văn bản ban hành";
	public String phong_ban_thuc_hien_vb = "Đơn vị Upgrade";
	public String cong_ty_phat_hanh_vb = "Công ty Xăng dầu Khu vực I";
	public String optionNguoiKyVB = "32;#Bùi Trọng Nghĩa";
	public String tien_do = "65";
}