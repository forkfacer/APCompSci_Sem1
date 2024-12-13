/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

		// myCharacter test = new myCharacter();
		// test.printStats();
		
		// myCharacter thisisme = new myCharacter("Wizard", 4, 3, 10, 3);
		// thisisme.printStats();

		myCharacter sig = new myCharacter("Warrior", 9, 10, 2, 3);
		sig.setRole("Rogue");
		sig.setStrength(4);
		sig.setDexterity(10);
		sig.setIntelligence(-7);
		sig.setCharisma(-6);
		sig.printStats();
		System.out.println(sig.setAll("Wizard", 3, 5, 6, -8));
		sig.printStats();

	}
}
