/*
 *Author: Rastin Roointan
 *  Date: 10-26-24
 *Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
	

	Dog mat = new Dog("Matthew");
	mat.setAge(200);
	boolean sm = mat.isSleeping();
	Dog kev = new Dog("Kevin","man");
	
	
	if(sm){
		mat.bark();
	}
	
	else{
		System.out.println("Sleeping");
	}


	if(sm){
		kev.bark();
	}

	}
}