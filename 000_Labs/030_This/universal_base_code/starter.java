/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		
		int rand1 = (int)(Math.random()*100);
		
		PooleDwarf d1 = new PooleDwarf(randName(), rand1);
		PooleDwarf d2 = new PooleDwarf(randName(), rand1);
		PooleDwarf d3 = new PooleDwarf(randName(), rand1);
		PooleDwarf d4 = new PooleDwarf(randName(), rand1);
		PooleDwarf d5 = new PooleDwarf(randName(), rand1);
		PooleDwarf d6 = new PooleDwarf(randName(), rand1);
		PooleDwarf d7 = new PooleDwarf(randName(), rand1);
		
		int x = 1;

		if (d2.isSameName(d1.getName())){
			
			x++;
		}
		if (d3.isSameName(d1.getName())){
			
			x++;
		}
		if (d4.isSameName(d1.getName())){
			
			x++;
		}
		if (d5.isSameName(d1.getName())){
			
			x++;
		}
		if (d6.isSameName(d1.getName())){
			
			x++;
		}
		if (d7.isSameName(d1.getName())){
			
			x++;
		}
		
		if(x>1){
		System.out.println("The name "+d1.getName()+" had " + x + " duplicates");
		}
		else{
			System.out.println("The name "+d1.getName()+" had " + x + " duplicate");
		}
	}
}
