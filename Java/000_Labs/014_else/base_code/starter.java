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
		System.out.println("Guess the number");
		int x = sc.nextInt();
		int y = (int)(Math.random()*1000);
		if(x==y){
			System.out.println("You are correct, this is my number");
		}
		else{
			System.out.println("Wrong "+y+ " was my number ");
		}
	}
}
