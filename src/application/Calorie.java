package application;
import java.util.Scanner;

public class Calorie {
	private static int numFood;
	private static int totalCalorie;

	/**
	 * this reference to instance variable
	 * @param numFood reference to instance.
	 */
	public void foodAttributions (int numFood){
		this.numFood = numFood;
	}
	/**
	 * User menu of options that are available. Documenting calories and excercises.
	 */
	public static void userMenu(){
		int totalCalorie = 0;
		int totalLoss = 0;
		int numFood = 0;
		int userNum = 0;
		Boolean valid = false;
		Boolean returnMenu = false;
		while (!returnMenu){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Document\n1. Food \n2. Excercises \n3. Return");
			while(!valid){
				try{
					userNum=scanner.nextInt();
					valid = true;
				} catch (Exception e){
					System.out.println("You didn't enter a valid number! Try Again!\nDocument\n1. Food \n2. Excercises");
					scanner.next();
				}
			} 
			valid = false;
			if (userNum == 1){
				System.out.println("How many different types of food would you like to document? ");
				while(!valid){
					try{
						numFood = scanner.nextInt();
						intCheck(numFood);
						valid = true;
					} catch (Exception e){
						System.out.println("You didn't enter a valid number! Try Again! \nHow many different types of food would you like to document? ");
						scanner.next();
					}
				}
				valid = false;
				while (!valid){
					for (int counter = 0; counter <= numFood - 1; counter++){
						System.out.println("Calories: ");
						try{
							int food = scanner.nextInt();
							totalCalorie += food;
						} catch (Exception e){
							System.out.println("You didn't enter a valid number! Try Again!\n");
							scanner.next();
						}
						valid = true;
					}
						assert totalCalorie >= 0;
				}
				System.out.println(totalCalorie + " Calories Gained");
				valid = false;
				
			}else if (userNum  == 2){
				System.out.println("Minutes of Running: ");
				int minutes = scanner.nextInt();
				totalLoss = 9 * minutes;
				System.out.println(totalLoss + " Calories Loss");
				System.out.println(totalCalorie-totalLoss + " Total Calories\n");
				valid = false;
				//break;
				//returnMenu = true;

			} else if (userNum == 3){
				returnMenu = true;
			}
		} 

	}
	/**
	 * Precondition for integer check.
	 * @param numFood checks if numFood is an integer.
	 */
	public static void intCheck(int userInput){
		if (userInput == 0){
			throw new IllegalArgumentException("Try again!");
		}
	}

}
