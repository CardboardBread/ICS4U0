package stack;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static LinkedList<String> stack;
	
	private static String input = "";
	private static boolean user = true;
	private static int iterate = 0;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		stack = new LinkedList<String>();
		construct(true);
		iterate = 0;
		print(stack);
		
		while (user)
		{
			System.out.println("?");
			input = keyboard.next();
			if (input.contains("peek") || input.contains("pe"))
			{
				System.out.println(stack.peek());
			}
			else if (input.contains("push") || input.contains("pu"))
			{
				stack.push(keyboard.next());
			}
			else if (input.contains("exit") || input.contains("ex"))
			{
				user = false;
			}
			else if (input.contains("print") || input.contains("pr"))
			{
				print(stack);
			}
			else if (input.contains("construct") || input.contains("co"))
			{
				stack = new LinkedList<String>();
				construct(true);
				iterate = 0;
				print(stack);
			}
			else if (input.contains("pop") || input.contains("po"))
			{
				stack.removeFirst();
			}
		}
		keyboard.close();
	}
	
	private static void construct(boolean pass)
	{
		if (pass)
		{
			iterate += 1;
			stack.add("Stack " + iterate);
			Random rand = new Random();
			construct(rand.nextBoolean());
		}
	}
	
	private static void print(LinkedList<String> list)
	{
		for (String str : list)
		{
			System.out.println(str);
		}
	}
}
