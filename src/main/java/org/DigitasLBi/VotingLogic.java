package org.DigitasLBi;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * This class will take DOB from user as a input and check whether the user is
 * valid for voting or not.
 * 
 * @author Ganesh Gole
 *
 */
public class VotingLogic {

	/**
	 * Name of the user
	 */
	static String Name = null;

	/**
	 * This will be use passed to a LocaleDate object to form a birthDate
	 */
	static int Year, Month, Day;

	/**
	 * This is the Birth Date of user taken from user
	 */
	static LocalDate birthDate = null;

	/**
	 * This method return the difference between the current system date and the
	 * user input date
	 * 
	 * @param birthDate
	 * @return Return integer of difference of user date and system date
	 */
	public static int calculateAge(LocalDate birthDate) {
		birthDate = LocalDate.of(Year, Month, Day);
		return LocalDate.now().compareTo(birthDate);
	}

	/**
	 * 
	 * @param birthDate
	 *            user inputed date to compare with current date
	 * @return Return true if age is between 18 to 100 otherwise false
	 */
	public static boolean result(LocalDate birthDate) {
		if ((calculateAge(birthDate) >= 18) && (calculateAge(birthDate) <= 100)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method contains the Scanner class object to take input from user. Input
	 * taken from user is :
	 * 
	 * Name - Name of the user Other than name DOB is also taken as input to compare
	 * it with current date. Year - Year of Birth Month - Month of Birth Date - Date
	 * of Birth
	 * 
	 * and this Year, Month, Day is use to form a LocaleDate class Object and name
	 * it as birthDate
	 * 
	 */
	public static void isUserValid() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		Name = scanner.next();
		System.out.println("Enter Year of birth (yyyy):");
		Year = scanner.nextInt();
		System.out.println("Enter month of birth (mm) :");
		Month = scanner.nextInt();
		System.out.println("Enter day of birth(dd) :");
		Day = scanner.nextInt();
		birthDate = LocalDate.of(Year, Month, Day);
		System.out.println("Hello " + Name + ", Result for validation is : " + VotingLogic.result(birthDate));
		scanner.close();
	}

	/**
	 * Calling point of program
	 * 
	 * @param args
	 *            Argument to pass at runtime
	 */
	public static void main(String[] args) {
		VotingLogic.isUserValid();
	}
}