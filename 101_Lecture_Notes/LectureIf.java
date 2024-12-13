/* 
    Lecture note example - If Statements
*/


import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

System.out.println("Lebron sets off on his quest to become the COSMIC KING");
System.out.println("How will Lebron set off on his journey (Choose 1,2, or 3");
System.out.println("1. Tries to find the Cosmic Crown");
System.out.println("2. Goes to the Court of Celestials to compete in Cosmic Games");
System.out.println("3. Join the Galactic alliance to defeat Nebulon, The Evil Warlord");

int answer = sc.nextInt();

if(answer == 1){
    System.out.println("LeBron James is chosen by a celestial being to find the missing Cosmic Crown, the key to ruling the universe. He travels through strange planets, battling powerful rulers like Juno, the Star-Forged Titan.");
    System.out.println("With each victory, he gains new powers—like manipulating gravity and flying. In the final showdown, he faces Korvath, Master of Dimensions, to claim the title of King of the Universe.");
}
else if(answer == 2){
    System.out.println("LeBron is teleported to the Court of the Celestials, where he competes in epic cosmic games. His opponents are beings who control fire, water, and even time. To win and be crowned King of the Universe, LeBron must not only rely on his athletic skills but learn how to harness cosmic energy. His final game is against Tidalon, the Water Weaver, in a match that could change the fate of the universe.");
}
else if(answer == 3){
    System.out.println("LeBron joins the Galactic Alliance to stop the evil warlord Nebulon from conquering the universe. Equipped with a powerful space armor, he travels to different star systems, gathering allies. In a final battle on the Obsidian Moon, LeBron faces Nebulon one-on-one, using his strength and strategy to protect the galaxy and rise as its king.");
}
else{
    System.out.println("Lil bro this was not an option");
}

	}
}