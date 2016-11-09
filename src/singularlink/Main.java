package singularlink;

import java.util.*;

public class Main {
	
	public static Worker work;
	public static Item item;

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		work = new Worker();
		item = new Item(work.first, work.last, work.reference);
		LinkedList<Item> list = work.list;
		Boolean cont = true;
		
		while (cont == true) {
			
			String input = keyboard.next();
			
			if (input.equals("d")) {
				work.display(list);
			} else if (input.equals("af")) {
				work.addFront(list, keyboard);
			} else if (input.equals("ae")) {
				work.addEnd(list, keyboard);
			} else if (input.equals("df")) {
				work.delEnd(list);
			} else if (input.equals("de")) {
				work.delFirst(list);
			} else if (input.equals("exit")) {
				keyboard.close();
				cont = false;
			}
		}
	}
}
