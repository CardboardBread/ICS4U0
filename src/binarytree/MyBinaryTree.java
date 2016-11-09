package binarytree;

public class MyBinaryTree
{
	EmployeeInfo root;
	
	public MyBinaryTree (int rootValue)
	{
		root = new EmployeeInfo(rootValue);
	}
	
	public void append (int value, EmployeeInfo start)
	{
		EmployeeInfo newChild = new EmployeeInfo(value);
		if (value < start.getValue())
		{
			if (start.getLeft() != null)
			{
				append(value, start.getLeft());
			}
			else
			{
				start.setLeft(newChild);
			}
		}
		else
		{
			if (start.getRight() != null)
			{
				append(value, start.getRight());
			}
			else
			{
				start.setRight(newChild);
			}
		}
	}
}
