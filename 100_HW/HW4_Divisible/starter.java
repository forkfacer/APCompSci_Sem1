/*
 *	Author: Rastin Roointan
 *  Date: 9-27-24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter Integer:");
int num1 = sc.nextInt();
System.out.println("Enter Integer");
int num2 = sc.nextInt();

if (num1%2 == 0){
	System.out.println("\n" + num1 + " is even");
	System.out.println(num1 + " is divisible by 2");
}
else{
	System.out.println("\n" + num1 + " is odd");
	System.out.println(num1 + " is not divisble by 2");
}

boolean xo = (num1%3 == 0);
boolean xe = (num1%4 == 0);
boolean xo2 = (num1%5 == 0);

if (xo2 == true){
	System.out.println(num1 + " is divisble by 5");
}
else if(xe == true){
	System.out.println(num1 + " is divisble by 4");
}
else if(xo==true){
	System.out.println(num1 + " is divisble by 3");
}
else{
	System.out.println(num1 + " is not divisble by 3, 4, or 5");
}

if (num2%2 == 0){
	System.out.println("\n" + num2 + " is even");
	System.out.println(num2 + " is divisible by 2");
}
else{
	System.out.println("\n" + num2 + " is odd");
	System.out.println(num2 + " is not divisble by 2");
}

boolean xol = (num2%3 == 0);
boolean xel = (num2%4 == 0);
boolean xo2l = (num2%5 == 0);

if (xo2l == true){
	System.out.println(num2 + " is divisble by 5");
}
else if(xel == true){
	System.out.println(num2 + " is divisble by 4");
}
else if(xol==true){
	System.out.println(num2 + " is divisble by 3");
}
else{
	System.out.println(num2 + " is not divisble by 3, 4, or 5");
}


	}
}
