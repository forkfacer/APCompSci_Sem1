/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();
		
		int m = 0;
		int count = 0;
		String[] arr = new String[99999];
		
		while(true){
            if(sentence.indexOf(" ") == -1){
                arr[m] = sentence;
                count++;
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            arr[m] = word;
            m++;
            count++;
            sentence = sentence.substring(space + 1);
        }
		
		String storage = "";
	
		
		for (int i = 0; i<count; i++){
			if ((arr[i].substring(0,1).equals("b") || arr[i].substring(0,1).equals("B") || arr[i].substring(0,1).equals("c") || arr[i].substring(0,1).equals("C") || arr[i].substring(0,1).equals("d") || arr[i].substring(0,1).equals("D") || arr[i].substring(0,1).equals("f") || arr[i].substring(0,1).equals("F") || arr[i].substring(0,1).equals("g") || arr[i].substring(0,1).equals("G") || arr[i].substring(0,1).equals("h") || arr[i].substring(0,1).equals("H") || arr[i].substring(0,1).equals("j") || arr[i].substring(0,1).equals("J") || arr[i].substring(0,1).equals("k") || arr[i].substring(0,1).equals("K") || arr[i].substring(0,1).equals("l") || arr[i].substring(0,1).equals("L") || arr[i].substring(0,1).equals("m") || arr[i].substring(0,1).equals("M") || arr[i].substring(0,1).equals("n") || arr[i].substring(0,1).equals("N") || arr[i].substring(0,1).equals("p") || arr[i].substring(0,1).equals("P") || arr[i].substring(0,1).equals("q") || arr[i].substring(0,1).equals("Q") || arr[i].substring(0,1).equals("r") || arr[i].substring(0,1).equals("R") || arr[i].substring(0,1).equals("s") || arr[i].substring(0,1).equals("S") || arr[i].substring(0,1).equals("t") || arr[i].substring(0,1).equals("T") || arr[i].substring(0,1).equals("v") || arr[i].substring(0,1).equals("V") || arr[i].substring(0,1).equals("w") || arr[i].substring(0,1).equals("W") || arr[i].substring(0,1).equals("x") || arr[i].substring(0,1).equals("X") || arr[i].substring(0,1).equals("y") || arr[i].substring(0,1).equals("Y") || arr[i].substring(0,1).equals("z") || arr[i].substring(0,1).equals("Z")) && (
arr[i].substring(1,2).equals("b") || arr[i].substring(1,2).equals("B") || arr[i].substring(1,2).equals("c") || arr[i].substring(1,2).equals("C") || arr[i].substring(1,2).equals("d") || arr[i].substring(1,2).equals("D") || arr[i].substring(1,2).equals("f") || arr[i].substring(1,2).equals("F") || arr[i].substring(1,2).equals("g") || arr[i].substring(1,2).equals("G") || arr[i].substring(1,2).equals("h") || arr[i].substring(1,2).equals("H") || arr[i].substring(1,2).equals("j") || arr[i].substring(1,2).equals("J") || arr[i].substring(1,2).equals("k") || arr[i].substring(1,2).equals("K") || arr[i].substring(1,2).equals("l") || arr[i].substring(1,2).equals("L") || arr[i].substring(1,2).equals("m") || arr[i].substring(1,2).equals("M") || arr[i].substring(1,2).equals("n") || arr[i].substring(1,2).equals("N") || arr[i].substring(1,2).equals("p") || arr[i].substring(1,2).equals("P") || arr[i].substring(1,2).equals("q") || arr[i].substring(1,2).equals("Q") || arr[i].substring(1,2).equals("r") || arr[i].substring(1,2).equals("R") || arr[i].substring(1,2).equals("s") || arr[i].substring(1,2).equals("S") || arr[i].substring(1,2).equals("t") || arr[i].substring(1,2).equals("T") || arr[i].substring(1,2).equals("v") || arr[i].substring(1,2).equals("V") || arr[i].substring(1,2).equals("w") || arr[i].substring(1,2).equals("W") || arr[i].substring(1,2).equals("x") || arr[i].substring(1,2).equals("X") || arr[i].substring(1,2).equals("y") || arr[i].substring(1,2).equals("Y") || arr[i].substring(1,2).equals("z") || arr[i].substring(1,2).equals("Z"))){
				storage = storage + (arr[i].substring(2) + "-" + arr[i].substring(0,2) + "ay ");
			}
			else if(arr[i].substring(0,1).equals("b") || arr[i].substring(0,1).equals("B") || arr[i].substring(0,1).equals("c") || arr[i].substring(0,1).equals("C") || arr[i].substring(0,1).equals("d") || arr[i].substring(0,1).equals("D") || arr[i].substring(0,1).equals("f") || arr[i].substring(0,1).equals("F") || arr[i].substring(0,1).equals("g") || arr[i].substring(0,1).equals("G") || arr[i].substring(0,1).equals("h") || arr[i].substring(0,1).equals("H") || arr[i].substring(0,1).equals("j") || arr[i].substring(0,1).equals("J") || arr[i].substring(0,1).equals("k") || arr[i].substring(0,1).equals("K") || arr[i].substring(0,1).equals("l") || arr[i].substring(0,1).equals("L") || arr[i].substring(0,1).equals("m") || arr[i].substring(0,1).equals("M") || arr[i].substring(0,1).equals("n") || arr[i].substring(0,1).equals("N") || arr[i].substring(0,1).equals("p") || arr[i].substring(0,1).equals("P") || arr[i].substring(0,1).equals("q") || arr[i].substring(0,1).equals("Q") || arr[i].substring(0,1).equals("r") || arr[i].substring(0,1).equals("R") || arr[i].substring(0,1).equals("s") || arr[i].substring(0,1).equals("S") || arr[i].substring(0,1).equals("t") || arr[i].substring(0,1).equals("T") || arr[i].substring(0,1).equals("v") || arr[i].substring(0,1).equals("V") || arr[i].substring(0,1).equals("w") || arr[i].substring(0,1).equals("W") || arr[i].substring(0,1).equals("x") || arr[i].substring(0,1).equals("X") || arr[i].substring(0,1).equals("y") || arr[i].substring(0,1).equals("Y") || arr[i].substring(0,1).equals("z") || arr[i].substring(0,1).equals("Z")){
				storage = storage + (arr[i].substring(1) + "-" + arr[i].substring(0,1) + "ay ");
			}
			else if(arr[i].substring(0,1).equals("a") || arr[i].substring(0,1).equals("A") || arr[i].substring(0,1).equals("e") || arr[i].substring(0,1).equals("E") || arr[i].substring(0,1).equals("i") || arr[i].substring(0,1).equals("I") || arr[i].substring(0,1).equals("o") || arr[i].substring(0,1).equals("O") || arr[i].substring(0,1).equals("u") || arr[i].substring(0,1).equals("U")){
				storage = storage + (arr[i] + "-way ");
			}
		}
		
		System.out.println(storage);
		
	}
}
