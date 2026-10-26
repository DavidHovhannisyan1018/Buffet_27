/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Welcome to the Online Slot Machine, you start with 100 virtual dollars. How much would you like to wager?");
		int wager = sc.nextInt();
		sc.nextLine();
		while(true){
			if(money==0){
				System.out.println("You out of money buddy");
			break;
			}
			int random1 = (int)(Math.random()*10);
			int random2 = (int)(Math.random()*10);
			int random3 = (int)(Math.random()*10);
			if((random1==random2)&&(random3==random2)){
				System.out.println("You have tripled your money");
				money=money+wager*3;
				System.out.println("You have, "+money+" left.");
			}
			else if((random1==random2)||(random2==random3)||(random3==random1)){
				System.out.println("Congrats you doubled your money!");
				money=money+wager*2;
				System.out.println("You have, "+money+" left.");
			}
			else if((random1!=random2)||(random2!=random3)||(random3!=random1)){
				System.out.println("Well, you lost ur mullah");
				money=money-wager;
				System.out.println("You have, "+money+" left.");
			}
			System.out.println("Do you want to play again?");
			String play = sc.nextLine();
			if((play.equals("no"))||(play.equals("No"))||(play.equals("N"))||(play.equals("n"))){
				System.out.println("okay, ggs");
				break;
			}
			else if((play.equals("yes"))||(play.equals("Yes"))||(play.equals("Y"))||(play.equals("y"))){
				System.out.println("How much would you like to wager?");
				wager=sc.nextInt();
				sc.nextLine();
			}
			else{
				System.out.println("You typed something wrong");
			}
		}
	}
}
