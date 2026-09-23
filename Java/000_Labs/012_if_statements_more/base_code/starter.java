/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num = sc.nextInt();
		int nub = sc.nextInt();
		boolean sigma = num==nub;
		boolean alpha = num != nub;
		if(sigma){
			System.out.println("These numbers are equal");
		}
		if(alpha){
			System.out.println("These numbers are not equal");
		}
	}
}
