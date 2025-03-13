package PracticeSet2;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number (1-12): ");
		int month = sc.nextInt();

		int days;
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
		case 4, 6, 9, 11 -> days = 30;
		case 2 -> days = 28; // Leap year check can be added
		default -> {
			System.out.println("Invalid month number!");
			return;
		}
		}
	    System.out.println("Number of days: " + days);
        sc.close();
	}
}
