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

		String[] arr = new String[10];
		arr[0] = "No, no, no";
		arr[1]= "Yeah, oh, oh";
		arr[2]= "Yeah, oh, oh";
		arr[3]= "(We love you Tecca) yeah, yeah";
		arr[4]= "She just hit my phone, she said, Tecca, you a winner (that's Tec)";
		arr[5]= "I just took her home, then I turned her to a sinner";
		arr[6]= "(Rambow)";
		arr[7]= "She just hit my phone, she's like, Tecca, you a winner (yeah)";
		arr[8] = "Took her home, then I turn her to a sinner, yeah";
		arr[9]= "I just got a check, I ate lobster for dinner"; 
	
		for (int x=0; x<arr.length; x++){
			System.out.println(arr[x]);
		}
		
	}
}
