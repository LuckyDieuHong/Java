
public class Producer {
	private String nameProducer;
	private Nation nation;
	public Producer(String nameProducer, Nation nation) {
		this.nameProducer = nameProducer;
		this.nation = nation;
	}
	public String getNameProducer() {
		return nameProducer;
	}
	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}
	public Nation getNation() {
		return nation;
	}
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	public String layTenQuocGia() {
		// TODO Auto-generated method stub
		return this.nation.getNationName();
	}
	
	
	
}
