package PracticeSet2;

import java.util.Scanner;

public class CountNotes {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the amount: ");
	        int amount = sc.nextInt();
	        int[] notes = { 500, 200, 100, 50, 20, 10, 5, 2, 1};
	        System.out.println("Currency count:");
	        for (int note : notes) {
	            if (amount >= note) {
	                System.out.println(note + " : " + amount / note);
	                amount %= note;
	            }
	        }
	}

}
