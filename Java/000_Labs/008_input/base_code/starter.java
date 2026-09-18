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
		System.out.println("First Name?");
		String text = sc.nextLine();
		System.out.println(text);
		System.out.println("Age");
		int num = sc.nextInt();
		System.out.println(num);
	    System.out.println("Birth Month?");
		int monthy = sc.nextInt();
		System.out.println(monthy);
		System.out.println("Birthday Day?");
		String day = sc.nextLine();
	
 System.out.println(day);
System.out.println("Birthday Year");
int sigma = sc.nextInt();
System.out.println(sigma);
System.out.println("How much is a buck fifty?");
double sig = sc.nextDouble();
System.out.println(sig);


	}
}
