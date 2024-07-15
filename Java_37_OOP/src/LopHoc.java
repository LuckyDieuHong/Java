
public class LopHoc {
	private String tenLop, tenKhoa;
	public LopHoc(String className, String facultyName)
	{
		this.tenKhoa=facultyName;
		this.tenLop=className;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getTenKhoa() {
		return tenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}
	
}
