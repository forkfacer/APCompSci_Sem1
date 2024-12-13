/*
 *	Author:Rastin Roointan
 *  Date: 9-16-24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER INTEGER: ");
	int num1 = sc.nextInt();
	
	System.out.println("This number must be bigger than the first one");
	System.out.println("ENTER SECOND INTEGER: ");
	int num2 = sc.nextInt();

	System.out.println("Your range is " + num1 + " to " + num2);

	int a = (int) (num1 + Math.random() * (num2-num1));
	int b = (int) (num1 + Math.random() * (num2-num1));
	int c = (int) (num1 + Math.random() * (num2-num1));
	int d = (int) (num1 + Math.random() * (num2-num1));
	int e = (int) (num1 + Math.random() * (num2-num1));

	System.out.println("Here are 5 numbers from your range: ");
	String cm = ", ";
	System.out.println(a+cm+b+cm+c+cm+d+cm+e);

	}
}
