/*
 *	Author: Rastin Roointan
 *  Date: 10-23-24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		pam.employeeToString();
		
		Employee mat = new Employee(420, "Matthew", "Park", 250.0);
		mat.employeeToString();
		
		dwight.raiseSalary(6);
		System.out.println(dwight.getFirstName());	
		System.out.println(dwight.getSalary());
		System.out.println(dwight.getAnnualSalary());
		System.out.println("--------------------");

		jim.raiseSalary(4);
		System.out.println(jim.getFirstName());		
		System.out.println(jim.getSalary());
		System.out.println(jim.getAnnualSalary());
		System.out.println("--------------------");
		
		pam.raiseSalary(1);
		System.out.println(pam.getFirstName());
		System.out.println(pam.getSalary());
		System.out.println(pam.getAnnualSalary());
		System.out.println("--------------------");
		
		mat.raiseSalary(100);
		System.out.println(mat.getFirstName());
		System.out.println(mat.getSalary());
		System.out.println(mat.getAnnualSalary());
		System.out.println("--------------------");
		
		
		
	}
}
