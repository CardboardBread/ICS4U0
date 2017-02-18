package stack;

import java.util.Random;

public class StackItem {
	
	private int identifier;
	private String name;
	public StackItem next;

	public StackItem(int id) {
		Random rand = new Random();
		identifier = id;
		name = Long.toString(rand.nextLong());
		next = null;
	}
	
	public int getID () { return identifier; }
	public String getName () { return name; }
	public StackItem getNext () { return next; }
	
	public void setName (String value) { name = value; }
	public void setID (int value) { identifier = value; }
	public void setNext (StackItem value) { next = value; }
	
}
