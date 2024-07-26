package Test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		
		//currentTime
		long time1 = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			System.out.println("Test");
//		}
		long time2=System.currentTimeMillis();
		System.out.println("Before run for: "+time1);
		System.out.println("After run for: "+time2);
		System.out.println("The time 'for' run: "+((time2-time1)/1000)+"s");

		//timeUnit
		System.out.println("Love you 3000 years = "+TimeUnit.DAYS.toSeconds(3000*365)+"s");
		System.out.println("24h = "+TimeUnit.HOURS.toSeconds(24)+"s");
		System.out.println("86400s = "+TimeUnit.SECONDS.toDays(86400)+" days");
		
		//Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println((d.getDate())+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));

		//Calendar
		Calendar c = Calendar.getInstance();
		//Calendar.get
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 1);
		System.out.println(c.toString());
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

		c.add(Calendar.DATE, 4);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

		
		//DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));
		
	}
}
