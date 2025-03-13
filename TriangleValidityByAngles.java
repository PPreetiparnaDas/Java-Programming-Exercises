package PracticeSet2;

import java.util.Scanner;

public class TriangleValidityByAngles {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter three angles of triangle: ");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

	        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
	            System.out.println("Valid Triangle");
	        } else {
	            System.out.println("Invalid Triangle");
	        }
	        sc.close();
	}

}
