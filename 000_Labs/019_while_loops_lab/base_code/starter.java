/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
		
	System.out.println("What is your name:");
	String name = sc.nextLine();

	System.out.println("\nHow many times:");
	int times = sc.nextInt();
	
	int x = 0; 
	while (true){
		if(x == times){
			break;
		}
		System.out.print("\n" + name);
		x = x + 1;
	}
		
	}
}
