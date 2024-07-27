package test;

public class testMain {
	public static void main(String[] args) {
		Schedule tkb_f = new Schedule(Day.Friday, "CTDL&DT");
		Schedule tkb_m = new Schedule(Day.Monday, "English");
		Schedule tkb_w = new Schedule(Day.Wednesday, "CTMT");
		Schedule tkb_t = new Schedule(Day.Thursday, "CSDL");

		System.out.println("Schedule on Friday: "+tkb_f.toString());
		System.out.println("Schedule on Monday: "+tkb_m.toString());
		System.out.println("Schedule on Wednesday: "+tkb_w.toString());
		System.out.println("Schedule on Tuesday: "+tkb_t.toString());
		String x = Day.Friday.timeInADay();
		System.out.println(x);
	}
}
