/*
 *	Author: Rastin Roointan
 *  Date: 9-22-24
 *	Collaborator(s): Me
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("0 = Sunday \n1 = Mon \n2 = Tue \n3 = Wed \n4 = Thurs \n5 = Fri \n6 = Sat");
	System.out.println("What day is it tommorow:");
	int day = sc.nextInt();
	
	if (day == 0 || day == 1){
		System.out.println("Your alarm will be at 7:00 AM");
	}
	else{
		System.out.println("Your alarm will be at 10:00 AM");
	}

	}
}
