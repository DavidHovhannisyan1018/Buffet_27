/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("I have a random whole number and u will guess it!");
	
	int sigma = sc.nextInt();
	int x = (int)(Math.random()*1000);
	while(true){
		if(x==sigma){
			System.out.println("ggs");
			break;
		}
		
			System.out.println("You guessed "+sigma+" and u was wrong");
			System.out.println("The number is between, " +(sigma+50)+" and, "+ (sigma-50));

				
			System.out.println("Guess it again");
			sigma=sc.nextInt();
			if(sigma!=x){
				System.out.println("The number is between "+(sigma-5)+" and " +(sigma+3));
				System.out.println("Guess again");

			}
			sigma=sc.nextInt();
			if(sigma!=x){
				System.out.println("You really aren't good at this, the number is between "+(sigma-1)+" and "+ (sigma+1));
				System.out.println("Guess again!");

			}
			sigma=sc.nextInt();
			if(sigma!=x){
				System.out.println("Ye there ain't hope for you, the number is between "+sigma+" and " +(sigma+1));

			}
			sigma = sc.nextInt();
			if(sigma!=x){
				System.out.println("Thats said but there is 1 more option");
			}
			sigma=sc.nextInt();
		}

	
	}
}
