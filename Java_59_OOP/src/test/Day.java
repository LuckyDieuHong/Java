package test;

import java.util.concurrent.TimeUnit;

public enum Day {
	Monday ("Morning Noon Night"),
	Tuesday ("Morning Noon Night"),
	Wednesday ("Morning Noon Night"),
	Thursday ("Morning Noon Night"),
	Friday ("Morning Noon Night"),
	Saturday ("Morning Noon Night"),
	Sunday ("Morning Noon Night");
	
	private final String  timeInADay;
	
	Day(String timeInADay) {
		this.timeInADay = timeInADay;
	}
	
	public String timeInADay()
	{
		return this.timeInADay;
	}
}
