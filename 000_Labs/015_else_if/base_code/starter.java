/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	int x = (int) (Math.random() * 1001);
	System.out.println("Guess a number between 1 and 1000:");
	int num = sc.nextInt();
	
	if (num == x){
		System.out.println("RIGHTTTTTTTTT");
	}
	else if (num>x){
		System.out.println("The answer is lower");
	}
	else if (num<x){
		System.out.println("The answer is higher");
	}

	}
}
