/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	toString("Write a Sentence!");
	String input1 = sc.nextLine();
	toString("Write a Sentence!");
	String input2 = sc.nextLine();


	toStringCombined(input1, input2);
		
	}
	
	public static void toString(String something){
		System.out.println(something);

	}
		
	public static void toStringCombined(String input1, String input2){
		System.out.println("\nThis is using the methods");
		System.out.println(input1);
		System.out.println(input1 + " " + input2);
		
	}	
		
	
	
}
