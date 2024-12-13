/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your name");
		String name = sc.nextLine();
		System.out.println("Hello, your name is " + name);
		System.out.println("Write your age");
		String age = sc.nextLine();
		System.out.println("Now I know that your age is " + age);
		System.out.println("Write your Birthday Month");
		String birthmonth = sc.nextLine();
		System.out.println("Now I know that your Birthday Month is " + birthmonth);
		System.out.println("Write your Birthday Day");
		String birthday = sc.nextLine();
		System.out.println("Now I know that your Birthday Day is " + birthday);
		System.out.println("Write your Birthday Year");
		String birthyear = sc.nextLine();
		System.out.println("Now I know that your Birthday year is " + birthyear);
		System.out.println("How much is a buck fifty");
		String buck = sc.nextLine();
		System.out.print("So a buck fifty is " + buck);


	}
}
