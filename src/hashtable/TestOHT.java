package hashtable;

public class TestOHT {
	public static final int bucketCount = 2;
	public static boolean user = true;
	public static OpenHashTable hash;
	
	public static void main(String[] args) {
		
		// Initialize new hash table
		hash = new OpenHashTable(bucketCount);
		
		// Add sample data
		hash.addEmployee(new EmployeeInfo(1, "Ear", "Day"));
		hash.addEmployee(new EmployeeInfo(2, "Giant", "Rat"));
		hash.addEmployee(new EmployeeInfo(3, "Regular", "Rat"));
		hash.addEmployee(new EmployeeInfo(4, "Quamtun", "Entanglmnt"));
		hash.addEmployee(new EmployeeInfo(5, "Spooky", "Skeleton"));
		hash.addEmployee(new EmployeeInfo(6, "Rat", "1"));
		hash.addEmployee(new EmployeeInfo(7, "Rat", "2"));
		hash.addEmployee(new EmployeeInfo(8, "Rat", "3"));
		hash.addEmployee(new EmployeeInfo(9, "Garbage", "Can"));
		hash.addEmployee(new EmployeeInfo(10, "This", "Net"));
		hash.addEmployee(new EmployeeInfo(11, "Banana", "Peel"));
		hash.addEmployee(new EmployeeInfo(12, "A", "1"));
		hash.addEmployee(new EmployeeInfo(13, "AB", "12"));
		hash.addEmployee(new EmployeeInfo(14, "ABC", "123"));
		hash.addEmployee(new EmployeeInfo(15, "ABCD", "1234"));
		hash.addEmployee(new EmployeeInfo(16, "ABCDE", "12345"));
		hash.displayContents();
		
	}
}
