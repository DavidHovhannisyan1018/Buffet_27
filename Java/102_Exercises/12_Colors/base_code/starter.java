/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);
getColor(r,g,b);
System.out.println("Complementary Color");
getColor(255-r, +255-g, +255-b);
System.out.println("Swap 1");
getColor(b,+ g, +r);
System.out.println("Swap 2");
getColor(g, +b, +r);
int d = (int)(Math.random()*128);
int c = (int)(Math.random()*128);
int p = (int)(Math.random()*128);
System.out.println("Dark Color");
getColor(d, c, p);
int l = (int)(Math.random()*128+128);
int k = (int)(Math.random()*128+128);
int i = (int)(Math.random()*128+128);
System.out.println("Light Color");
getColor(l, k, i);
int j = (int)(Math.random()*128+128);
System.out.println("Bluer Color");
getColor(d, c, j);
int sigma= (int)(Math.random()*128+83);
int free = (int)(Math.random()*128+12);
int lick= (int)(Math.random()*128+12);


System.out.println("My Own Style");
getColor(sigma, free, lick);




		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);






    }
}
