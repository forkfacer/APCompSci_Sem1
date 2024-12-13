/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("CHOOSE: Wizard, Warrior, or Rogue");
	String cla = sc.nextLine();
	
	if ((cla.equals("Wizard")) || (cla.equals("Warrior")) || (cla.equals("Rogue"))){
		System.out.println("You are now a " + cla);
	}
	else {
		System.out.println("THAT IS NOT AN OPTION");
	}

	}
}
