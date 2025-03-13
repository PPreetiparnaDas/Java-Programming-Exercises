package PracticeSet2;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter week number (1-7): ");
        int day = sc.nextInt();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        if (day >= 1 && day <= 7) {
            System.out.println("Weekday: " + days[day - 1]);
        } else {
            System.out.println("Invalid input!");
        }
        sc.close();

	}

}
