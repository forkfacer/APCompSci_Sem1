/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int rand = (int)(1 + (Math.random() * 1000));
int guess = 0;
while (guess != rand){
	System.out.println("Guess a number (1-1000):");
	guess = sc.nextInt();
	if(guess>rand){
		System.out.println("The number is lower");
	}
	if(guess<rand){
		System.out.println("The number is higher");
	}
}
System.out.println("Good job you guessed it :)");
	}
}
