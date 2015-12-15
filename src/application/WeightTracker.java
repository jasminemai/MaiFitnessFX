package application;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class WeightTracker {
	private static int currentWeight;
	/**
	 * this reference to instance variable.
	 * @param currentWeight gathers the current weight
	 */
	public void foodAttributions (int currentWeight){
		this.currentWeight = currentWeight;
	}

	/**
	 * Collects the current weight.
	 */
	public static void weightTrack(){
		int currentWeight = 0;
		Boolean valid = false;
		Scanner scanner = new Scanner(System.in);
		while(!valid){
			System.out.println("Enter your current weight for this week: ");
			try{
				currentWeight= scanner.nextInt();
				intCheck(currentWeight);
				valid = true;
			} catch (Exception e){
				System.out.println("You didn't enter a valid number! Try Again!");
				scanner.next();
			}

		}
		valid = false;
		System.out.println(currentWeight);
		try {
			PrintWriter printer = new PrintWriter("WeightTracker.txt");
			printer.write(String.valueOf(currentWeight));
			printer.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("File not found. Please scan in new file.");
		}
	}
	/**
	 * Precondition for integer validity. 
	 * @param currentWeight integer check
	 */
	public static void intCheck(int currentWeight){
		if (currentWeight == 0){
			throw new IllegalArgumentException("Try again!");
		}
	}
}
