package pkg;
import java.util.Scanner;
import java.util.Random;

//global var
public class Dog {
String name; 
int age; 
String breed; 


//Constructors
public Dog() {
name = "Clifford";
age = 3; 
breed = "big red dog";
}

public Dog(String n, int a, String b){
name = n;
age = a;
breed = b; 
}

public Dog(String n){
name = n; 
age = 1; 
breed = "dog dog";
}

public Dog(String n, String b){
name = n;
breed = b;
age = 1; 
}

public Dog(String n, int a){
name = n;
age = a; 
breed = "dog dog";
}


//Methods
public void setAge(int a){
age = a; 
}

public void setBreed(String b){
breed = b; 
}

public void setName(String smth){
	
name = smth;
}


public String getName(){
return name; 

}

public int getAge(){
return age; 
}



public boolean isSleeping(){
int x = (int)(Math.random()*2);
if (x == 0){
return false;
}
else{
return true;
}
}



public String getBreed(){
return breed; 
}


public void bark(){
System.out.println(name + " barks!");
}

}