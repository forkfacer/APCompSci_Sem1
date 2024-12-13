/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
    printAnimal();
    printAnimal();
    printAnimal();
    printAnimal();
    printAnimal();

    greeting("Matthew");
    greeting("Kevin Cho");
    greeting("Ben");

    System.out.println("\n");

    double newSalary = raise(100000, 9);
    System.out.println(newSalary);
    newSalary = raise(newSalary, 6);
    newSalary = raise(newSalary, 6);
    newSalary = raise(newSalary, 6);
    newSalary = raise(newSalary, 6);
	System.out.println(newSalary);
	
    }
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary*(percent/100.0));
	    return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("Wsg " + name);
	}
	
    public static void printAnimal(){
        System.out.println(" ||  ||  ");
        System.out.println(" \\\\()// ");
        System.out.println("//(__)\\\\");
        System.out.println("||    ||\n");
    }
	
	
}