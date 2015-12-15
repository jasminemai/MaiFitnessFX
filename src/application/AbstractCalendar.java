package application;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class AbstractCalendar {
	/**
	 * Provides the date.
	 * @return The day of the month.
	 */
	public int getDate() {
		   DateFormat format = new SimpleDateFormat("dd");
		   Date date = new Date();
		   return Integer.parseInt(format.format(date));
	  }
	
	/**
	 * Gets the workout from the specific day of the month.
	 * @return Workout from specific day of the month.
	 */
	public String getWorkoutDays() {
		int day = getDate();
		String workout = "";
		for (int i=1; i <= day; i++ )
			if (day == i){
				return workout;
			}
		return null;
	}
	/**
	 * Gets the string workout.
	 * @return null; has daughter classes to return the workout.
	 */
	public String getWorkout() {
		return null;
	}



}
