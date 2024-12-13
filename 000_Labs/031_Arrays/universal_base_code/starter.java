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

		int[] arr = new int[10];
		int x = 9;
		for (int c = 0; c<arr.length; c++){
			arr[c]=x;
			System.out.println(arr[c]);
			x--;
		}
		
	}
}
