package application;
import java.util.Random;


public class DailyTip {

	/**
	 * A list of strings within an array that provide tips.
	 * @return Randomized string from the selection of tips.
	 */
	public static String tipsArray(){
		String[] tips = new String[8];
		tips[0] = "Drink more water!";
		tips[1] = "Positivity & Motivation is the key!";
		tips[2] = "Avoid processed foods! If you can't read the ingredient, don't eat it!";
		tips[3] = "Eat foods filled with alkaline like root or cruciferous vegetables!";
		tips[4] = "Watch what you eat! Look at you're consuming!";
		tips[5] = "Find a workout partner, company can be seen as motivation!";
		tips[6] = "Working out will result in higher energy!";
		tips[7] = "Tired of plain water? Add fruit!";

		int randomNum = new Random().nextInt(tips.length);
		return tips[randomNum];
	}

}
