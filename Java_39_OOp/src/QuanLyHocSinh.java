
public class QuanLyHocSinh extends Student {
	private int stt;
	private String khoa;
	public QuanLyHocSinh(String hoVaTen, int namSinh, String className, String studentID, int stt, String khoa) {
		super(hoVaTen, namSinh, className, studentID);
		this.stt = stt;
		this.khoa = khoa;
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	
	public String hoTenHocSinh()
	{
		return this.getHoVaTen();
	}
}
