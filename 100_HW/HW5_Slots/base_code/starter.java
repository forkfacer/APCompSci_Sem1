/*
 *	Author: Rastin Roointan
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Slot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\n   a. If two numbers match, you double your money.\n   b. If three numbers match, you triple your money.\n   c. If none match, you lose your money.");
	System.out.println("--------------------------------------------------\n");

	int money = 100;
	
	//main while statement
	String response;
	

	while (true) {

	if (money==0){
		System.out.println("You've run out of money! Thanks for coming! Come back soon!");
		break;
	}

	System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
	response = sc.nextLine();

//main
	if ((response.equals("y")) || (response.equals("Y")) || (response.equals("Yes")) || (response.equals("yes")) ){
		System.out.print("\nYou have $" + money + ". How much would you like to wager? ");
		
		int wager;
		while (true){
		wager = sc.nextInt();
		sc.nextLine();
		
		if(wager>money){
			System.out.print("You only have $" + money + "! Please enter a smaller number: ");
		}
		else if (wager<=0){
		System.out.print("Sneaky! No negatives or 0! Try again: ");
		}
		else {
			money = money-wager;
			break;
		}
		
		}
		
		System.out.println("\nGreat! Let's play!!!!");
		System.out.println("Your rolls are:");
		System.out.println("_______________________");
		int x = ((int)(1 + Math.random()*10));
		int y = ((int)(1 + Math.random()*10));
		int z = ((int)(1 + Math.random()*10));
		System.out.println("    | " + x + " | " + y + " | " + z + " | ");
		System.out.println("_______________________");
		
		if (x==y || x==z || y==x || y==z || z==x || z==y) {
			System.out.println("You won! You're wager has now been doubled!");
			money = money + wager * 2;
			System.out.println("\n--------------------------------------------------");
			System.out.println("You now have $" + money + "\n");

		}
		else if(x==y && x==z) {
			System.out.println("You won! You're wager has now been tripled!");
			money = money + wager * 3;
			System.out.println("\n--------------------------------------------------");
			System.out.println("You now have $" + money + "\n");
		}
		else{
			System.out.println("Didn't win this time, better luck next time!\nYou now have $" + money + ".");
			System.out.println("\n--------------------------------------------------\n");
		}




	}
	
	//IF NO
	else if ((response.equals("n")) || (response.equals("N")) || (response.equals("No")) || (response.equals("no"))){
		System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
		break;
	}
	
	else {
		System.out.println("That wasn't quite the correct answer. Try again.\n--------------------------------------------------\n");
	}
	

//total
	}


	
	
	
	
	}

}
