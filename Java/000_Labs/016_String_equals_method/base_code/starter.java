/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue Class?");
		String sigma = sc.nextLine();
		if(sigma.equals(("wizard"))||(sigma.equals("Wizard"))){
			System.out.println("You have chosen the Wizard class!");
		}
		else if((sigma.equals("warrior"))||(sigma.equals("Warrior"))){
			System.out.println("You have chosen the Warrior class!");
		}
		else if((sigma.equals("rogue"))||(sigma.equals("Rogue"))){
			System.out.println("You have chosen the Rogue class!");
		}
		else{
			System.out.println("You have not chosen an available class...");
		}
	}
}
