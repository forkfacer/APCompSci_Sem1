/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Word:");
		String word = sc.nextLine();
		
		System.out.print("Letter by letter:");
		for(int x=0; x<word.length(); x++){
		System.out.print("\n" + x + " " + word.substring(x, x+1));
		}
	}
}
