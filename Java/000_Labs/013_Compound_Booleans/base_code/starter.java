/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if((x>z) && (x>y)){
			System.out.println(x +" is the biggest");
		}
		if((y>z) && (y>x)){
			System.out.println(y + " is the biggest");
		}
		if((z>x) && (z>y)){
			System.out.println(z + " is the biggest");
		}
		if((x<y) && (x<z)){
			System.out.println(x + " is the smallest");
		}
		if((y<x) && (y<z)){
			System.out.println(y + " is the smallest");
		if((z<x) && (z<y)){
			System.out.println(z+ " is the smallest");
		}
		}
	}
}
