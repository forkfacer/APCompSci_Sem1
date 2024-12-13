/*
 *	Author: Rastin Roointan 
 *  Date: 10-18-24
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
		role = "No Role";
		strength = 5;
		dex = 5;
		intel = 5;
		charis = 5;
		
	}
	
	public myCharacter(String r, int s, int d, int i, int c){
		role = r;
		strength = s;
		dex = d;
		intel = i;
		charis = c;
	}
	

	//Methods
	public void printStats(){
		if ((role == "Rogue")||(role == "rogue")){
			System.out.println("You chose Rogue! How cunning!");
		}
		else if ((role == "Wizard")||(role == "wizard")){
			System.out.println("You chose Wizard! Excelisor!");
		}
		else if ((role == "Warrior")||(role == "warrior")){
			System.out.println("You chose Warrior! For Honor!");
		}
		else if (role == "No Role"){
			System.out.println("Your role is No Role");
		}
		
		System.out.println("Your strength is " + strength + "\nYour dexterity is " + dex + "\nYour intelligence is " + intel + "\nYour charisma is " + charis);
		System.out.println("---------------------------");
	}

}

