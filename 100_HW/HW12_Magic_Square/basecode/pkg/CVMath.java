package pkg;

public class CVMath {		



	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static boolean addToSquare(int numsquare){
		int z = 1;
		int total = 0; 
		boolean x = true;

		while (true){
			total = total + z;
			z++;
			if (total == numsquare){
				x = true;
				break;
			}
			else if (total > numsquare){
				x = false;
				break;
			}
		}
		return x;
	}
	
	public static void specialSquare(int numtimes){
		int i = 0;
		int x = 1;
		while (i<numtimes){
			if ((((int)Math.sqrt(x)) == Math.sqrt(x)) && (addToSquare(x))){
				i++;
				System.out.print(x + "\n");
			}
			x++;
		}
	}
}
