package org.DigitasLBi;

import java.time.LocalDate;
import java.util.Scanner;

public class VotingLogic {

	static String Name = null;
	static int Year, Month, Day;
	static LocalDate birthDate = null;

	public static int calculateAge(LocalDate birthDate) {
		birthDate = LocalDate.of(Year, Month, Day);
		return LocalDate.now().compareTo(birthDate);
	}

	public static boolean result(LocalDate birthDate) {
		if (calculateAge(birthDate) >= 18) {
			return true;
		} else {
			return false;
		}
	}

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

	public static void main(String[] args) {
		VotingLogic.isUserValid();
	}
}