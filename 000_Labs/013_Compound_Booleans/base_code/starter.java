/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("NUMBER 1:");
	int num1 = sc.nextInt();
	
	System.out.println("NUMBER 2:");
	int num2 = sc.nextInt();
	
	System.out.println("NUMBER 3:");
	int num3 = sc.nextInt();

	if((num1>num2) && (num1>num3))
	{
		System.out.println("Number 1 is the biggest: " + num1);	
	}
	if((num2>num1) && (num2>num3))
	{
		System.out.println("Number 2 is the biggest: " + num2);	
	}
	if((num3>num1) && (num3>num2))
	{
		System.out.println("Number 3 is the biggest: " + num3);	
	}
	
	//SEPERATION HERE
	
	if((num1<num2) && (num1<num3))
	{
		System.out.println("Number 1 is the smallest: " + num1);	
	}
	if((num2<num1) && (num2<num3))
	{
		System.out.println("Number 2 is the smallest: " + num2);	
	}
	if((num3<num1) && (num3<num2))
	{
		System.out.println("Number 3 is the smallest: " + num3);	
	}
	

	}
}
