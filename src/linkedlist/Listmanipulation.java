package linkedlist;

import java.util.*;

public class Listmanipulation {

	void addFront (LinkedList<String> list, Object data) {
		list.addFirst((String) data);
	}
	
	void addBack (LinkedList<String> list, Object data) {
		list.addLast((String) data);
	}
	
	void set(LinkedList<String> list, int index, Object data) {
		list.set(index, (String) data);
	}
}
