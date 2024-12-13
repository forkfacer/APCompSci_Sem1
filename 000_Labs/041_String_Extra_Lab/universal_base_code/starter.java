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
        
        String phrase = "";
        
        while(true){
            if(sentence.indexOf(" ") == -1){
                phrase = sentence + " " + phrase;
                System.out.println(phrase);
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            phrase = word + " " + phrase;
            sentence = sentence.substring(space + 1);
        }
        
			
		
	}
}
