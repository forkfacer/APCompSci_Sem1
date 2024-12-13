/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

		myCharacter test = new myCharacter();
		test.printStats();
		
		myCharacter thisisme = new myCharacter("Wizard", 4, 3, 10, 3);
		thisisme.printStats();

		
	}
}
