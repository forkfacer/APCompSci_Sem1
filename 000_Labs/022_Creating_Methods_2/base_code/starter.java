/*
 *	Author:  Rastin Roointan
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// lab 22

	Scanner sc = new Scanner(System.in);

	System.out.println("What is your base number?");
	int base = sc.nextInt();
	System.out.println("What is your exponent number?");
	int exp = sc.nextInt();
	int powanswer = pow(base,exp);
	System.out.println("Your answer is: " + powanswer);
		
	}
	
	public static int pow(int base, int exp){
		int base1 = base;
		while(exp>=2){
			base1 = base1*base;
			exp--;
		}
		return base1;
	}
	
}
