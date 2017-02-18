package binarytree;

public class EmployeeInfo {
	private EmployeeInfo left;
	private EmployeeInfo right;
	private int value;
	private String name;

	public EmployeeInfo(int nodeValue, String name) {
		left = null;
		right = null;
		value = nodeValue;
		this.name = name;
	}

	public void setLeft(EmployeeInfo child) {
		left = child;
	}

	public void setRight(EmployeeInfo child) {
		right = child;
	}

	public EmployeeInfo getLeft() {
		return left;
	}

	public EmployeeInfo getRight() {
		return right;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
