/*
 *	Author: Rastin Roointan
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	//MAIN CODE
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input a number and we'll print out every prime until that number: ");
	int num2 = sc.nextInt();
	printPrimes(num2);
	


	}
	
	//METHODS
	public static boolean checkPrime(int num1){
		int divis = num1 - 1;
		boolean isprime = false;
		while (divis>=2){
			if (num1 % divis != 0){
				isprime = true;
				
			}
			else if (num1 % divis == 0){
				isprime = false;
				break;
			}
		divis--; 
		}
		if (divis == 1){
			isprime = true;
		}
		return isprime;
	}
	
	public static void printPrimes(int num1){
		int notmax = 1;
		while(notmax <= num1){
			if(checkPrime(notmax)){
				System.out.println(notmax);
				
			}
			notmax++;
		}	
		
	}
	
}
