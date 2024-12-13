/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("NUMBER 1:");
	int x = sc.nextInt();
	System.out.println("NUMBER 2:");
	int y = sc.nextInt();
	
	if(x==y)
	{
		System.out.println("The two numbers are equal to each other");
	}
	
	if(x!=y)
	{
		System.out.println("The two numbers are not equal to each other");
	}
	
}
}
