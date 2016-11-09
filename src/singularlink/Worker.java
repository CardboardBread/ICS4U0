package singularlink;

import java.util.*;

public class Worker {
		
	public String first;
	public String last;
	public String reference;
	
	public Item item = new Item(first, last, reference);
	
	public LinkedList<Item> list = new LinkedList<>();
	
	void addFront (LinkedList<Item> list, Scanner input) {
		
		System.out.println("What is the first name?");
		first = input.next();
		System.out.println("What is the last name?");
		last = input.next();
		reference = list.get(0).toString();
		
		Item out = new Item(first, last, reference);
		
		list.addFirst(out);
	}
	
	void addEnd (LinkedList<Item> list, Scanner input) {
				
		System.out.println("What is the first name?");
		first = input.next();
		System.out.println("What is the last name?");
		last = input.next();
		reference = "null";
		
		Item out = new Item(first, last, reference);
		
		list.addLast(out);
	}
	
	void delEnd (LinkedList<Item> list) {
		list.removeLast();
	}
	
	void delFirst (LinkedList<Item> list) {
		list.removeFirst();
	}
	
	void display (LinkedList<Item> subject) {
		for (Item item : subject) {
			System.out.print(item.first + ", ");
			System.out.print(item.last + ", ");
			System.out.println(item.reference);
		}
	}
}
