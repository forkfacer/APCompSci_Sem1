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
		BaseClass real = new BaseClass();

	int[] arr = new int[100];
		
		for (int i = 0; i<arr.length; i++){
			arr[i] = (int)(1 + Math.random()*100);
		}
		
	toStringArray(arr);
	System.out.println("\n-------------------------");
	System.out.println(getArrayAverage(arr));	
	System.out.println("-------------------------");
	System.out.println(getArrayMax(arr)); 
	System.out.println("-------------------------");
	System.out.println(getArrayMin(arr)); 


	}
	
	public static void toStringArray(int[] x){
		for(int i = 0; i<x.length; i++){
			System.out.print(x[i] + " ");
		}
	}
	
	public static int getArrayAverage(int[] x){
		int avadd = 0;
		for(int i = 0; i<x.length; i++){
			avadd = avadd + x[i];
		}
		int average = avadd / x.length;
		return average;
	}
	
	public static int getArrayMax(int[] x){
		int maxi = Integer.MIN_VALUE;
		for(int i = 0; i<x.length; i++){
			if(x[i] > maxi){
				maxi = x[i];
			}
		}
		return maxi;
	}
	
	public static int getArrayMin(int[] x){
		int mini = Integer.MAX_VALUE;
		for(int i = 0; i<x.length; i++){
			if(x[i] < mini){
				mini = x[i];
			}
		}
		return mini;
	}
	
}
