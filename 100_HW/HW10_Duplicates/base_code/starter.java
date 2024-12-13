/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int[] arr = new int[20];

		 for (int i = 0; i<arr.length; i++){
		 	int x = (int) (1 + Math.random()*9);
		 	arr[i] = x;
		 	System.out.print(arr[i] + " ");
		 }
		 
		 
		 System.out.print("\nThe index of the duplicates are " );
		 int z = (int) (1 + Math.random()*9);
		 int dupc = 0;
		 for (int i = 0; i<arr.length; i++){
			if (arr[i] == z){
				dupc++;
				System.out.print(i + " ");
			}
		 }
		 System.out.println("\nThere are " + dupc + " copies of the number " + z);
		 
		int i2 = 0;
		for(int i = 1; i<arr.length; i++){
			i2 = i - 1;
			if (arr[i]==arr[i2]){
				System.out.println("There are two consecutive numbers in the indexes " + i2 + " and " + i + " of the number " + arr[i]);
			}
		}
			
			
			
	}
}
