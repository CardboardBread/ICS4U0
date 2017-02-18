package stack;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public static Worker stack;
	public static boolean user = true;
	
	private static String input = "";

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		stack = new Worker(1);
		
		for (int i = 0; i < 1; i++) {
			Random rand = new Random();
			stack.push(rand.nextInt());
		}
		
		while (user)
		{
			System.out.println("?");
			input = keyboard.next();
			if (input.contains("peek") || input.contains("pe"))
			{
				System.out.println(stack.peek().getID() + " : " + stack.peek().getName());
			}
			else if (input.contains("push") || input.contains("pu"))
			{
				stack.push(keyboard.nextInt());
			}
			else if (input.contains("exit") || input.contains("ex"))
			{
				user = false;
			}
			else if (input.contains("print") || input.contains("pr"))
			{
				stack.print(stack.stackTop);
			}
			else if (input.contains("construct") || input.contains("co"))
			{
				stack.build(1);
			}
			else if (input.contains("pop") || input.contains("po"))
			{
				StackItem out = stack.pop();
				System.out.println(out.getID() + " : " + out.getName());
			}
		}
		keyboard.close();
	}

}
