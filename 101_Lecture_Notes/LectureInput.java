/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Your Name:");
    String name = sc.nextLine();

    System.out.println("Number 1 is:");
    int num1 = sc.nextInt();
    sc.nextLine();

    System.out.println("Number 2 is:");
    int num2 = sc.nextInt();
    sc.nextLine();
    
    System.out.println("The Sum: " + (num1 + num2));
    
    System.out.println("Favorite Food:");
    String food = sc.nextLine();
    
	}
}