package hashtable;

import java.util.Random;
import java.util.Scanner;

import employee.EmployeeInfo;

public class TestOHT {
	public static final int bucketCount = 10;
	public static boolean user = true;
	public static OpenHashTable hash;
	
	public static void main(String[] args) {
		hash = new OpenHashTable(bucketCount);
		Scanner keyboard = new Scanner(System.in);
		
		hash.addEmployee(new EmployeeInfo(27, "Ear", "Day"));
		hash.addEmployee(new EmployeeInfo(4, "Giant", "Rat"));
		hash.addEmployee(new EmployeeInfo(5, "Regular", "Rat"));
		hash.addEmployee(new EmployeeInfo(11, "Quamtun", "Entanglmnt"));
		hash.addEmployee(new EmployeeInfo(42, "Spooky", "Skeleton"));
		hash.addEmployee(new EmployeeInfo(101, "Rat", "1"));
		hash.addEmployee(new EmployeeInfo(8, "Rat", "2"));
		hash.addEmployee(new EmployeeInfo(26, "Rat", "3"));
		
		for (int i = 0; i < 100; i++) {
			Random random = new Random();
			EmployeeInfo goon = new EmployeeInfo(Math.abs(random.nextInt(10000)), random.toString());
			hash.addEmployee(goon);
		}
		
		while (user) {
			System.out.println("?");
			String input = keyboard.next();
			if (input.contains("exit")) {
				user = false;
			} else if (input.contains("add")) {
				System.out.println("Number?");
				int number = keyboard.nextInt();
				System.out.println("First name?");
				String first = keyboard.next();
				System.out.println("Last name?");
				String last = keyboard.next();
				if (hash.addEmployee(new EmployeeInfo(number, first, last))) {
					
				}
			} else if (input.contains("del")) {
				System.out.println("Target?");
				int target = keyboard.nextInt();
				if (hash.removeEmployee(target) != null) {
					System.out.println("Removed.");
				} else {
					System.out.println("Failed.");
				}
			} else if (input.contains("display")) {
				hash.displayContents();
			} else if (input.contains("search")) {
				System.out.println("Target?");
				int target = keyboard.nextInt();
				EmployeeInfo subject = hash.searchEmployee(target);
				if (subject != null) {
					System.out.println("ID: " +  subject.getNum() + ", Name: " + subject.getFirst() + " " + subject.getLast());
				} else {
					System.out.println("No employee found.");
				}
			}
		}
		keyboard.close();
	}
}
