package binarytree;

public class TestBinaryTree {
	public static void main(String[] args) {

		MyBinaryTree theTree = new MyBinaryTree();
		EmployeeInfo tempItem;

		tempItem = new EmployeeInfo(11, "a");
		theTree.insert(theTree.getRoot(), tempItem);

		tempItem = new EmployeeInfo(20, "b");
		theTree.insert(theTree.getRoot(), tempItem);

		System.out.println("");
		System.out.println("INORDER TRAVERSAL");
		MyBinaryTree.inOrder(theTree.getRoot());

		System.out.println("");
		System.out.println("PREORDER TRAVERSAL");
		MyBinaryTree.preOrder(theTree.getRoot());

		System.out.println("");
		System.out.println("POSTORDER TRAVERSAL");
		MyBinaryTree.postOrder(theTree.getRoot());

		System.out.println("");
		System.out.println("GOODBYE!");
	}
}
