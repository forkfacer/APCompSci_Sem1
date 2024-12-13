/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();
        
        int i = 0;
        String storage = "";
        
        while(i<sentence.length()){
        	if(i%2==1){
        		String letter = sentence.substring(i, i+1);
        		String uppersent = letter.toUpperCase();
        		storage = storage + uppersent;
        		i++;
        	}
        	else if(i%2==0){
        		String letter = sentence.substring(i, i+1);
        		String lowersent = letter.toLowerCase();
        		storage = storage + lowersent;
        		i++;
        	}
        }
        System.out.println("You're phrase in spongebob text: \n" + storage);
		
	}
}
