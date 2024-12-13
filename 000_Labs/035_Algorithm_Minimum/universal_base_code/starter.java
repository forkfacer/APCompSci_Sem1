/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {


		int thenum = (int)(51 + Math.random()*150);
		int[] arr = new int[thenum];

		 for (int i = 0; i<arr.length; i++){
		 	int x = (int) (1 + Math.random()*100);
		 	arr[i] = x;
		 	System.out.print(arr[i] + " ");
		 }
		 System.out.println("\n---------------------------------------------");
		 System.out.println("There are " + thenum + " elements.");
		 
		 int min = Integer.MAX_VALUE;
		 for (int i2= 0; i2<arr.length; i2++){
		 	if (arr[i2]<min){
		 		min = arr[i2];
		 	}
		 }
		System.out.println("The minimum is: " + min);
		
		 int max = Integer.MIN_VALUE;
		 for (int i3= 0; i3<arr.length; i3++){
		 	if (arr[i3]>max){
		 		max = arr[i3];
		 	}
		 }
		System.out.println("The maximum is: " + max);
		
		int average = 0;
		for(int i4=0; i4<arr.length; i4++){
			average = average + arr[i4];
		}
		int i5 = 0;
		average = average / (arr.length);
		System.out.println("The average is: " + average);
		
		
		
	}
}
