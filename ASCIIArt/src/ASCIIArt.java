/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void candleFlame() {
		System.out.println("      \"   \"   \"");
	}
	public static void candleBase() {
		System.out.println("     | | | | | |");
	}
	public static void candle() {
		candleFlame();
		candleBase();
		candleBase();
	}
	public static void topCake() {
		System.out.println("   /-|-|-|-|-|-|-\\");
		System.out.println("  (  | | | | | |  )");
	}
	public static void bodyCake() {
		System.out.println("  |\\_____________/|");
		System.out.println("  |               |");
	}
	public static void baseCake() {
		System.out.println("  \\_______________/");

	}
	public static void cake() {
		topCake();
		bodyCake();
		bodyCake();
		bodyCake();
		baseCake();
	}
	public static void main(String[] args) {
		System.out.println("Happy birthday! Make a wish!");
		candle();
		cake();
	}
	
	
}