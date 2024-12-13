import pkg.*;
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How mnay magic squares do you want: ");
		int x = sc.nextInt();
		CVMath.specialSquare(x);
		// System.out.println(CVMath.findMid(2,3,1));
	}
}
