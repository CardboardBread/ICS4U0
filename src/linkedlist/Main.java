package linkedlist;

import java.util.*;

public class Main {
	
	public static LinkedList<String> linkedlist;
	public static Listmanipulation listman;

	public static void main(String[] args) {
		
		linkedlist = new LinkedList<String>();
		listman = new Listmanipulation();
		
		for (int i = 0; i < 10; i++) {
			linkedlist.add("Item " + i);
		}
		
		listman.addBack(linkedlist, "goonBack");
		listman.addFront(linkedlist, "goonFront");
		
		int median = (linkedlist.size() / 2);
		listman.set(linkedlist, median, "Middle 1");
		
		System.out.println(linkedlist);
	}
}
