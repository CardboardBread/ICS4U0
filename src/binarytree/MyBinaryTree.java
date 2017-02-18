package binarytree;

public class MyBinaryTree {
	private EmployeeInfo root;

	/**
	 * Public constructor for instantiating the root value of the tree.
	 */
	public MyBinaryTree() {
		root = null;
	}

	/**
	 * Recursively searches through the binary tree for the lowest point (less
	 * than = left, else right).
	 * 
	 * @param emp
	 *            The new employee.
	 * @param start
	 *            The employee on which to start searching from.
	 */
	public void insert(EmployeeInfo start, EmployeeInfo emp) {
		if (start == null) {
			root = emp;
		} else {
			if (emp.getValue() < start.getValue()) {
				if (start.getLeft() != null) {
					insert(start.getLeft(), emp);
				} else {
					start.setLeft(emp);
				}
			} else {
				if (start.getRight() != null) {
					insert(start.getRight(), emp);
				} else {
					start.setRight(emp);
				}
			}
		}
	}

	public EmployeeInfo getRoot() {
		return root;
	}

	/**
	 * Performs a pre order traversal on the tree, returning its findings into a
	 * LinkedList.
	 * 
	 * @param root
	 *            Starting point.
	 */
	public static void preOrder(EmployeeInfo root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getValue() + " ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	/**
	 * Performs a post order traversal on the tree, returning its findings into
	 * a LinkedList.
	 * 
	 * @param root
	 *            Starting point.
	 */
	public static void postOrder(EmployeeInfo root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getValue() + " ");
	}

	/**
	 * Performs an in order traversal on the tree, returning its findings into a
	 * LinkedList.
	 * 
	 * @param root
	 *            Starting point.
	 */
	public static void inOrder(EmployeeInfo root) {
		if (root == null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getValue() + " ");
		inOrder(root.getRight());
	}
}
