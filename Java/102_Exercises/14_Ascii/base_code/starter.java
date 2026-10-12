/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	
		
		System.out.println("Welcome to the Ascii Museum");
		System.out.println("Please select what exhibit you'd like to view");
		System.out.println("1. Animals");
		System.out.println("2. Food");
		System.out.println("3. Space");
		String sigma = sc.nextLine();
		if(sigma.equals("animals")){
			System.out.println("Which animals would you like to see?");
			System.out.println("1. Dog");
			System.out.println("2. Cat");
			String anms = sc.nextLine();
			if(anms.equals("cat")){
				System.out.println("  /,|   (` ");
				System.out.println("_.|o o  |_   ) )");
				System.out.println("-(((---(((--------");
				System.out.println("The cat seems lost");
			}
			else if(anms.equals("dog")){
				System.out.println("..^____/");
				System.out.println("`-. ___ )");
				System.out.println("  ||  ||");
				System.out.println("The dog seems disfigured");
			}
			else{
				System.out.println("There is no section of this name");
			}
		}
			else if(sigma.equals("food")){
				System.out.println("What food would you like to see?");
				System.out.println("1. Chocolate");
				System.out.println("2. Peanut");
				String fds = sc.nextLine();
				if(fds.equals("chocolate")){
					System.out.println("__ __ __ __ __");
					System.out.println("/__/__/__/__/__/|");
					System.out.println("/__/__/__/__/__/|/");
					System.out.println(" |__'__'__'__'__|/");
					System.out.println("The chocolate looks ancient");
				}
				else if(fds.equals("peanut")){
					System.out.println(" ,+.");
					System.out.println("((|))");
					System.out.println(" )|(");
					System.out.println("((|))");
					System.out.println(" `-'");
					System.out.println("This peanut lookin velomtuous");
				}
				else{
					System.out.println("That is not a food buddy, museum closed");
				}
			}
		else if(sigma.equals("space")){
			System.out.println("What space thing would you like to see?");
			System.out.println("1. Meteor");
			System.out.println("2. Alien");
			String spc = sc.nextLine();
			if(spc.equals("meteor")){
				System.out.println("      .:'");
				System.out.println(" _.::'");
				System.out.println("(_.'");
				System.out.println("This meteor is blazing hot fr");
			
			}
			else if(spc.equals("alien")){
				System.out.println("   :-...'-:");
				System.out.println(".-'  ____  `-.");
				System.out.println("( (  (_()_)  ) )");
				System.out.println(" `-.   ^^   .-'");
				System.out.println("    `._==_.'");
				System.out.println("     __)(___");
				System.out.println("The alien seems a lil mad bruh");
			}
			else{
				System.out.println("That aint spacey bruh, museum closed");
			}
		}
		else{
			System.out.println("That aint a section, museum closed");
		}
	}
}
