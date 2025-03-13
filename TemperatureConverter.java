package PracticeSet2;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F)? ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
        } else if (choice == 'F' || choice == 'f') {
            System.out.println("Fahrenheit: " + ((temp * 9 / 5) + 32));
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();

	}

}
