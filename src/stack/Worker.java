package stack;

public class Worker {
	
	public StackItem stackTop;
	
	public Worker(int value) {
		stackTop = new StackItem(value);
	}
	
	public void build (int value) {
		stackTop = new StackItem(value);
	}

	public void push (int value) {
		StackItem bottom = findBottom(stackTop);
		StackItem next = new StackItem(value);
		bottom.setNext(next);
	}
	
	public StackItem pop () {
		StackItem bottom = findBottom(stackTop);
		StackItem out = bottom;
		bottom = null;
		return out;
	}
	
	public StackItem peek () {
		StackItem bottom = findBottom(stackTop);
		return bottom;
	}
	
	public void print (StackItem start) {
		if (start.getNext() != null) {
			System.out.println(start.getID() + " : " + start.getName());
			print(start.getNext());
		}
		return;
	}
	
	public StackItem findBottom (StackItem start) {
		if (start.getNext() != null) {
			return findBottom(start.getNext());
		} else {
			return start;
		}
	}

}
