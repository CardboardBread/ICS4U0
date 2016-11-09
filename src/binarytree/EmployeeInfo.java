package binarytree;

public class EmployeeInfo
{
	private EmployeeInfo left;
	private EmployeeInfo right;
	private int value;
	
	public EmployeeInfo (int nodeValue)
	{
		left = null;
		right = null;
		value = nodeValue;
	}
	
	public void setLeft (EmployeeInfo child) { left = child; }
	public void setRight (EmployeeInfo child) { right  = child; }
	
	public EmployeeInfo getLeft () { return left; }
	public EmployeeInfo getRight () { return right; }
	public int getValue () { return value; }
}
