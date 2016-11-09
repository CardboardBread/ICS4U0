package shapes;

import java.util.Scanner;

public class Main {

	public static Rectangle rect;
	public static Sphere sph;
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		rect = new Rectangle();
		sph = new Sphere();
				
		System.out.println("What is the height of your rectangle?");
		int height = keyboard.nextInt();
		
		System.out.println("What is the length of your rectangle?");
		int length = keyboard.nextInt();
		
		float volume = rect.volume(height, length);
		float perimeter = rect.volume(height, length);
		
		System.out.println("Your rectangle's volume is " + volume);
		System.out.println("Your rectangle's perimeter is " + perimeter);
		
		System.out.println("Where is your Sphere located?");
		
		System.out.print("X:");
		int x = keyboard.nextInt();
		System.out.println("");
		
		System.out.print("Y:");
		int y = keyboard.nextInt();
		System.out.println("");
		
		System.out.print("Z:");
		int z = keyboard.nextInt();
		System.out.println("");
		
		System.out.println("What is the radius?");
		int radius = keyboard.nextInt();
		double sphereVolume = sph.volume(radius);
		String location = sph.location(radius, x, y, z);
		
		System.out.println("Your sphere can be defined with " + location + " with a volume of " + sphereVolume);
		
		keyboard.close();
	}
}