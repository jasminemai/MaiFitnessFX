package application;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Account {
	private static String firstName;
	private static String lastName;
	private String height;
	private String password;
	public int weight;
	public int goal;
	/**
	 * Applies the this reference to instance variables, setting all the attributes of a user.
	 * @param firstName Stores user's first name.
	 * @param lastName Stores user's last name.
	 * @param password Stores user's password.
	 * @param height Stores user's height.
	 * @param weight Stores user's weight.
	 * @param goal Store user's goal weight.
	 */
	public void setAttributes(String firstName, String lastName, String password, String height, int weight, int goal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.height = height;
		this.weight = weight;
		this.goal = goal;

	}

	/**
	 * Method creates and collects information for a new user by asking for user input. Writes new file of user information.
	 * @return newUser, created new user.
	 */
	public static Account createUser(){
		String firstName = null;
		String lastName = null;
		String password = null;
		String height = null;
		int weight = 0;
		int goal = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("First Name: ");
		Boolean valid = false;
		while(!valid){
			try{
				firstName = scanner.nextLine();
				setRefresh(firstName);
				valid = true;
			} catch (Exception e){
				System.out.println("You didn't enter a valid first name! Try Again! \nFirst Name: ");
			}
		}
		valid = false;

		System.out.println("Last Name: ");
		while(!valid){
			try{
				lastName = scanner.nextLine();
				setRefresh(lastName);
				valid = true;
			} catch (Exception e){
				System.out.println("You didn't enter a valid last name! Try Again! \nLast Name: ");
			}
		}
		valid = false;

		System.out.println("Password: ");
		while(!valid){
			try{
				password = scanner.nextLine();
				setRefresh(password);
				valid = true;
			} catch (Exception e){
				System.out.println("You didn't enter a valid password! Try Again! \nPassword: ");
			}
		}
		valid = false;

		System.out.println("Height: ");
		while(!valid){
			try{
				height = scanner.nextLine();
				setRefresh(height);
				valid = true;
			} catch (Exception e){
				System.out.println("You didn't enter a valid height! Try Again! \nHeight: ");
			}
		}
		valid = false;

		System.out.println("Weight: ");
		while(!valid){
			try{
				weight = scanner.nextInt();
				valid = true;
			} catch (Exception e){
				System.out.println("You didn't enter a valid weight! Try Again! \nWeight:");
				scanner.next();
			}
		}
		valid = false;

		System.out.println("Goal Weight: ");
		while(!valid){
			try{
				goal = scanner.nextInt();
				valid = true;
			} catch (Exception e){
				System.out.println("You didn't enter a valid goal weight! Try Again!\nGoal Weight");
				scanner.next();
			}
		} 
		valid = false;

		try {
			PrintWriter printer = new PrintWriter("AccountInformation.txt");
			printer.write(firstName+lastName+"\n"+password);
			printer.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("File not found. Please scan in new file.");
		}

		Account newUser = new Account();
		newUser.setAttributes(firstName, lastName, password, height, weight, goal);
		return newUser;
	}

	public static void setRefresh(String userInput){
		if (userInput.length() == 0){
			throw new IllegalArgumentException("You need to enter something!");
		}

	}

	public static void intCheck(int userInput){
		if (userInput == 0){
			throw new IllegalArgumentException();
		}
	}

	/*
	 * Allows the user to log in and check the validity of the user information. Reads user information.
	 */
	public static boolean logIn(){
		Boolean userLogIn = false;
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Your username will be your first & last name combined with no space\nUsername: ");
			String validName = scanner.next();
			String line = null;
			try{
				FileReader fileReader = new FileReader("AccountInformation.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				while((line = bufferedReader.readLine()) !=null){
					if(validName.equals(line)){
						System.out.println("Password: ");
						String validPassword = scanner.next();
						String pass = bufferedReader.readLine();
						if (validPassword.equals(pass)){
							return true;
						} else{
							System.out.println("Your password is incorrect, try again!");
							break;
						}
					}
					else{
						System.out.println("Please enter a valid username!");
						break;
					}
				}
				bufferedReader.close();
			}
			catch(FileNotFoundException e){
				System.out.println("File not Found");
			}
			catch(IOException e){
				System.out.println("Error reading the file");
			}
		}
	}
}
