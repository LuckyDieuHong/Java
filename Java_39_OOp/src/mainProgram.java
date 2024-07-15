
public class mainProgram {
	public static void main(String[] args) {
		ConNguoi cn = new ConNguoi("Nguyen Hong Minh Quan", 2004);
		cn.an();
		cn.ngu();
		cn.ia();
		
		Student hs = new Student("Nguyen Hong Minh Quan", 2004, "DHTH08", "DH5201291");
		hs.an();
		hs.ngu();
		hs.ia();
		hs.doHomeWork();
		
		QuanLyHocSinh qLyHocSinh = new QuanLyHocSinh("Bruh", 2007, "DH25-TH07", "DH52502354", 5, "CNTT");
		qLyHocSinh.an();
		qLyHocSinh.ngu();
		qLyHocSinh.doHomeWork();
		System.out.println(qLyHocSinh.hoTenHocSinh());
		}
}
