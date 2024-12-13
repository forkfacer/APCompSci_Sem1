/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int[] arr = new int[1001];
		 int x = 3;
		 int i=0;
		 
		 while (i<arr.length){
		 	arr[i] = x;
		 	System.out.print(arr[i]);
			
			if (i<(arr.length - 1)){
				System.out.print(", ");
			}

		 	i++;
		 	x = x + 3;
		 }
		 
		 System.out.println("\n-------------------------------------------------------------------");
		 
		 int[] arr2 = new int[1001];
		 int x2 = 1000;
		 int i2 = 0;
		 while (i2<arr2.length){
		 	arr2[i2] = x2;
		 	System.out.print(arr2[i2]);
			
			if (i2<(arr2.length - 1)){
				System.out.print(", ");
			}

		 	i2++;
		 	x2--;
		 }
		 
	}
}
