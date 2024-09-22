package apps;
import model.Weekday;

public class WeekdayDemo {

	public static void main(String[] args) {
		Weekday day = Weekday.TUESDAY;
		System.out.println(day);
		
		System.out.println(day.getGermanName());
		System.out.println(day.getDayNumber());

	}

}
