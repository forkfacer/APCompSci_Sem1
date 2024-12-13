/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();
		
		int space1 = sentence.indexOf(" ");
		sentence = sentence.substring(space1+1);
		
		System.out.println(sentence);
		
	}
}
