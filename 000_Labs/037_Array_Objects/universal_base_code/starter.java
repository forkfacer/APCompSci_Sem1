/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {

		Warrior[] warrior = new Warrior[100];
	for(int i = 0; i < warrior.length; i++){
		warrior[i] = new Warrior();
	}
	
	Wizard[] wizard = new Wizard[100];
	for(int i = 0; i < wizard.length; i++){
		wizard[i] = new Wizard();
	}

	//count variables
	int warriord = 0; 
	int wizardd = 0; 
	
	//main while
	while( wizardd < 100 || warriord < 100 ){
	wizard[wizardd].attack(warrior[warriord]);
	
		if(warrior[warriord].isDead()){
			warriord++;
		}
		
		if(wizardd == 100 || warriord == 100){
			break; 
		}

		warrior[warriord].attack(wizard[wizardd]);
		if(wizard[wizardd].isDead()){
			wizardd++;
		}
		
		if(wizardd == 100 || warriord == 100){
			break; 
		}
	}
	//end of while
	
	if(wizardd>warriord){
		System.out.println("Warriors won and had " + (100-warriord) + " left");
	}
	
	if(wizardd<warriord){
		System.out.println("Wizards won and had " + (100-wizardd) + " left");
	}



	}
}
