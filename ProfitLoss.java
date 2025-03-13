package PracticeSet2;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter cost price and selling price: ");
	        double cp = sc.nextDouble(), sp = sc.nextDouble();

	        if (sp > cp) {
	            System.out.println("Profit: " + (sp - cp));
	        } else if (cp > sp) {
	            System.out.println("Loss: " + (cp - sp));
	        } else {
	            System.out.println("No profit, no loss.");
	        }
	        sc.close();

	}

}
