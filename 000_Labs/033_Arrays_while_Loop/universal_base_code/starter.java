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

		int[] arr = new int[1000];
		 int i=0;
		 
		 while (i<arr.length){
		 	int x = (int) (Math.random()*1000);
		 	arr[i] = x;
		 	System.out.print(arr[i] + " ");

		 	i++;
		 }
		
	}
}
