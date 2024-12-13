/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	//NAME
	System.out.println("NAME YOUR CHARACTER:");
	String name = sc.nextLine();
	//TITLE
	System.out.println("GIVE YOUR CHARACTER A TITLE:");
	String title = sc.nextLine();
	//ROLE
	System.out.println("CHOOSE: Wizard, Warrior, or Rogue");
	String cla = sc.nextLine();
	
	if ((cla.equals("Wizard")) || (cla.equals("Warrior")) || (cla.equals("Rogue")) || (cla.equals("wizard")) || (cla.equals("warrior")) || (cla.equals("rogue"))){
		System.out.println("You are now a " + cla);
	}
	else {
		System.out.println("THAT IS NOT AN OPTION \nChoose again:");
		cla = sc.nextLine();
			if ((cla.equals("Wizard")) || (cla.equals("Warrior")) || (cla.equals("Rogue"))){
						System.out.println("You are now a " + cla);

			}
		
	}
	//POINTS
	int maxpt1 = 20;
	//POINTS STRENGTH
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	System.out.println("# OF POINTS IN STRENGTH (1-10):");
	int stpo = sc.nextInt();
	if ((stpo>10) || (stpo<0)){
		System.out.println("CANNOT HAVE LESS OR MORE THAN 10 PER STAT \nChoose again:");
		stpo = sc.nextInt();
	}
	else{
		System.out.println("You now have " + stpo + " points of Strength");
	}
	int maxpt2 = maxpt1 - stpo;
	System.out.println("YOU HAVE " + maxpt2 + " POINTS LEFT");
	//POINTS DEX
	System.out.println("# OF POINTS IN (1-10):");
	int depo = sc.nextInt();
	if ((depo>10) || (depo<0)){
		System.out.println("CANNOT HAVE LESS OR MORE THAN 10 PER STAT \nChoose again:");
		stpo = sc.nextInt();

	}
	else{
		System.out.println("You now have " + depo + " points of Dexterity");
	}
	int maxpt3 = maxpt2 - depo;
	System.out.println("YOU HAVE " + maxpt3 + " POINTS LEFT");
	//POINTS INTEL
	System.out.println("Intelligence - Better at magic spells!");
	System.out.println("# OF POINTS IN INTELLIGENCE:");
	int inpo = sc.nextInt();
	int maxpt4 = maxpt3 - inpo;
	if ((inpo>10) || (inpo<0)){
		System.out.println("CANNOT HAVE LESS OR MORE THAN 10 PER STAT \nChoose again:");
		stpo = sc.nextInt();

	}
	else if (maxpt4 < 0){
		System.out.println("You do not have enough points");
	}
	else{
		System.out.println("You now have " + inpo + " points of Intelligence");
		System.out.println("YOU HAVE " + maxpt4 + " POINTS LEFT");
	//POINTS CHARISMA
	System.out.println("Charisma - How personable");
	System.out.println("# OF POINTS IN CHARISMA:");
	int chpo = sc.nextInt();
	int maxpt5 = maxpt4 - chpo;
	if ((chpo>10) || (chpo<0)){
		System.out.println("CANNOT HAVE LESS OR MORE THAN 10 PER STAT \nChoose again:");
		stpo = sc.nextInt();

	}
		else if (maxpt5 < 0){
		System.out.println("You do not have enough points");
	}
	else{
		System.out.println("You now have " + chpo + " points of Charisma");
	//ADDING
	if (maxpt5<0){
		System.out.println("BUT YOU ARE NOT ALLOWED MORE THAN 20 POINTS IN TOTAL \nRESTART THE CODE");
	}
	else{
	System.out.println("-----------------\nCHARACTER RESULTS:\n" + title + " " + name + "\nROLE: " + cla);
	System.out.println("STRENGTH: " + stpo + "\nDEXTERITY: " + depo +"\nINTELLIGENCE: " + inpo +"\nCHARISMA: " +chpo);
		
	}
	}
	}
	
	}
}
