package binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TestBinaryTree
{
	private static boolean user = true;
	private static String input = "";
	private static LinkedList<Integer> traversal;
	
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		MyBinaryTree tree = create();
		tree.append(12, tree.root);
		tree.append(8, tree.root);
		tree.append(3, tree.root);
		tree.append(15, tree.root);
		tree.append(6, tree.root);
		tree.append(10, tree.root);
		tree.append(4, tree.root);
		tree.append(9, tree.root);
		tree.append(11, tree.root);
		tree.append(14, tree.root);
		
		while (user)
		{
			System.out.println("?");
			input = keyboard.next();
			if (input.contains("pre"))
			{
				System.out.println("yeah");
				traversal = new LinkedList<Integer>();
				preOrder(tree.root);
				printTraversal(traversal);
			}
			else if (input.contains("post"))
			{
				traversal = new LinkedList<Integer>();
				postOrder(tree.root);
				printTraversal(traversal);
			}
			else if (input.contains("in"))
			{
				traversal = new LinkedList<Integer>();
				inOrder(tree.root);
				printTraversal(traversal);
			}
			else if (input.contains("exit"))
			{
				user = false;
			}
		}
		keyboard.close();
	}
	
	private static void printTraversal (LinkedList<Integer> list)
	{
		System.out.println(Arrays.toString(list.toArray()));
	}
	
	private static MyBinaryTree create ()
	{
		Random random = new Random();
		MyBinaryTree tree = new MyBinaryTree(random.nextInt());
		return tree;
	}
	
	private static MyBinaryTree create (int value)
	{
		MyBinaryTree tree = new MyBinaryTree(value);
		return tree;
	}
	
	private static void preOrder (EmployeeInfo root)
	{
		if (root == null) { return; }
		traversal.add(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	private static void postOrder (EmployeeInfo root)
	{
		if (root == null) { return; }
		postOrder(root.getLeft());
		postOrder(root.getRight());
		traversal.add(root.getValue());
	}
	
	private static void inOrder (EmployeeInfo root)
	{
		if (root == null) { return; }
		inOrder(root.getLeft());
		traversal.add(root.getValue());
		inOrder(root.getRight());
	}
}
