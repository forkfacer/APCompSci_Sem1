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
		if ((role.equals("Rogue"))||(role.equals("rogue"))){
			System.out.println("You chose Rogue! How cunning!");
		}
		else if ((role.equals("Wizard"))||(role.equals("wizard"))){
			System.out.println("You chose Wizard! Excelisor!");
		}
		else if ((role.equals("Warrior"))||(role.equals("warrior"))){
			System.out.println("You chose Warrior! For Honor!");
		}
		else if (role.equals("No Role")){
			System.out.println("Your role is No Role");
		}
		
		System.out.println("Your strength is " + strength + "\nYour dexterity is " + dex + "\nYour intelligence is " + intel + "\nYour charisma is " + charis);
		System.out.println("---------------------------");
	}
	
	public String setRole(String newrole){
		if ((newrole.equals("Rogue"))||(newrole.equals("rogue"))||(newrole.equals("Wizard"))||(newrole.equals("wizard"))||(newrole.equals("Warrior"))||(newrole.equals("warrior"))){
			role = newrole;
		}
		else{
			role = "No role";
		}
		return role;

		
	}
	
	public int setStrength(int s){
		strength=s;
		if (s<0){
			strength = 0;
		}
		return strength;
	}

	public int setDexterity(int d){
		dex=d;
		if (d<0){
			dex = 0;
		}
		return dex;
	}
	
	public int setIntelligence(int i){
		intel=i;
		if (i<0){
			intel = 0;
		}
		return intel;
	}
	
	public int setCharisma(int c){
		charis=c;
		if (c<0){
			charis = 0;
		}
		return charis;
	}
	
	public boolean setAll(String r, int s, int d, int i, int c){
		
		role = r;
		strength = s;
		dex = d;
		intel = i;
		charis = c;
		
		if ((c<0&&i<0&&d<0&&s<0)&&((!role.equals("Rogue"))||(!role.equals("rogue"))||(!role.equals("Wizard"))||(!role.equals("wizard"))||(!role.equals("Warrior"))||(!role.equals("warrior")))){
			return false;
		}
		else{
			return true;
		}
		
		
	}
	
	
	
}

