package application;

import java.util.*;

public class MaiFitness {
	/*
	 * User interface to determine which menu to go to.
	 */
	public static void main() {
		Scanner scanner = new Scanner(System.in); 
		Boolean exitMenu= false;

		while (!exitMenu){
			int option = 0;
			boolean integer = false;
			while (!integer){
				try{
					System.out.println("1. View daily workouts\n2. Document calories\n3. Document Weight\n4. Exit");
					option = scanner.nextInt();
					integer = true;
				} catch (Exception e){
					System.out.println("You didn't enter a number! Try again!");
					scanner.next();
				}
			}

			Boolean returnMenu = false;
			if (option == 1){
				while (!returnMenu){
					System.out.println("Please choose intensity level! \n1. Easy \n2. Hard\n3. Return");
					int choice = scanner.nextInt();
					while (!integer){
						try{
							choice = scanner.nextInt();
							integer = true;
						} catch (Exception e){
							System.out.println("You didn't enter a number! Try again!");
							scanner.next();
						}
					}


					AbstractCalendar calendar;
					if (choice == 1){
						calendar = new EasyCalendar();
						String workout = calendar.getWorkout();
						System.out.println(workout);
					} else if (choice == 2){
						calendar = new IntenseCalendar();
						String workout = calendar.getWorkout();
						System.out.println(workout);
					} else if (choice == 3){
						returnMenu = true;
					}
				}
			} else if (option == 2){
				Calorie.userMenu();
			} else if (option == 3){
				WeightTracker.weightTrack();
			}
			else {
				exitMenu=true;
			}
		}

	}
}



