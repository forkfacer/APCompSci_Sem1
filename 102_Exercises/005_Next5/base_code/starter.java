/*
 *	Author:Rastin Roointan
 *  Date: 9/10/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("NUMBER:");
	int num1 = sc.nextInt();
	
	System.out.println("The next 5 numbers are: \n" + (num1+1) + (",") +
	(num1+2) + (",") + (num1+3) + (",") + (num1+4) + (",") + (num1+5));
	sc.nextLine();
	
	System.out.println("Here are 5 multiples of the number "  + num1 + ":");
	System.out.println((num1) + (",") + (num1*2) + (",") + (num1*3) + (",")
	+ (num1*4) + (",") + (num1*5));

	System.out.println("Here is " + num1 + " divided by 100:");
	double num2 = num1;
	System.out.println((num2/100));
	
	System.out.println("Here is " + num1 + " divided by 10:");
	System.out.println(num2/10);

	}
}
