/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{

	//Global Variables
	String role;
	int strength;
	int dex;
	int intel;
	int charis; 

	//Constructors
	public myCharacter() {
		role = "Wizard";
		strength = 5;
		dex = 5;
		intel = 5;
		charis = 5;
		
	}
	

	//Methods
	public void printStats(){
		System.out.println("Your role is " + role + "\nYour strength is " + strength + "\nYour dexterity is " + dex + "\nYour intelligence is " + intel + "\nYour charisma is " + charis);
	}

}

