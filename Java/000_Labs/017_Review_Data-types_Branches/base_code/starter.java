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
		if((sigma.equals("wizard"))||(sigma.equals("Wizard"))){
			System.out.println("You have chosen the Wizard class!");
		}
		else if((sigma.equals("warrior"))||(sigma.equals("Warrior"))){
			System.out.println("You have chosen the Warrior class!");
		}
		else if((sigma.equals("rogue"))|| (sigma.equals("Rogue"))){
			System.out.println("You have chosen the Rogue class!");
		}
		else{
			System.out.println("You have not chosen an available class...");
		}
		System.out.println("What is your character name?");
		String alpha = sc.nextLine();
		System.out.println(alpha+ " is your character name!");
		System.out.println("What is your Character title?");
		String salpha = sc.nextLine();
		System.out.println(salpha+ " is your character title!");
		System.out.println("Type strength if you want to put stats in it maximum 10 points in each stat");
		int fanom = 20;
		String trait = sc.nextLine();
		if(trait.equals("strength")){
			System.out.println("How many points would you want in strength?");
			int seller = sc.nextInt();
			fanom = fanom-seller;
			if(seller>10){
				System.out.println("The value is above the maximum capacity");
				System.out.println("Type a number that meets the requirements");
				seller = sc.nextInt();
				if(seller>10){
					System.out.println("You had your chance buddy");
				}
				else{
					fanom=20-seller;
					System.out.println("You have "+fanom+" points left.");
				}
			}
			
			
				System.out.println("You have " + fanom + " points left");
				System.out.println("How much would you like in dexterity?");
				int foom = sc.nextInt();
				if(foom>10){
					System.out.println("Too many points buddy");
					System.out.println("Type a correct value");
					foom=sc.nextInt();
					
					if(foom>10){
						System.out.println("You had a chance, you wasted it");
					
					}
				}
				if(foom<10){
					System.out.println("wasted another chance...");
						
				
				
				
			
				int foo = fanom-foom;
				System.out.println("You have "+foo +" points left");
				System.out.println("How many points would you like in intelligence?");
				int fanum = sc.nextInt();
				if(fanum>10){
					System.out.println("Maximum stat buddy");
					System.out.println("New value needed");
					fanum=sc.nextInt();
				}
				else if(fanum>foo){
					System.out.println("You dont got that many points buddy");
				}
				if((fanum<foo)&&(fanum<10)){
					int food=foo-fanum;
					System.out.println("You have "+ food+ " points left");
					System.out.println("How many points would you like in charisma?");
					int foodoo = sc.nextInt();
					if(foodoo>10){
						System.out.println("Too many points in 1 stat");
						System.out.println("Type another value");
						foodoo=sc.nextInt();
					}
					else if(foodoo>food){
						System.out.println("You dont got that many buddy");
						System.out.println("Try another value");
						foodoo=sc.nextInt();
					}
					if((foodoo<10)&&(foodoo<=food)){
						System.out.println("Your class is "+ sigma +" your name is "+alpha+ " your title is "+ salpha);
						System.out.println("Your stats are strength: "+seller+ " Your dexterity is: "+foom);
						System.out.println("Intelligence: "+fanum+" Charisma: "+foodoo);
					
				
			
		
	

}
}
}
}
}
}