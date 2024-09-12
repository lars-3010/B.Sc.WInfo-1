package apps;

import model.Weekday;

public class WeekdayDemo {

	public static void main(String[] args) {
		Weekday day = Weekday.FRIDAY;
		System.out.println(day);
		System.out.println(day.getGermanName());
		System.out.println("Es ist der "+ day.getDayNumber() +". Tag der Woche.");
		System.out.println("Interne Zählung von " + day + " ist: " + day.ordinal());
	}

}
