package hashtable;

import java.util.ArrayList;

import employee.EmployeeInfo;

public class OpenHashTable
{
	public ArrayList<EmployeeInfo>[] buckets;
	
	public OpenHashTable (int bucketCount)
	{
		buckets = new ArrayList[bucketCount];
		
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();
		}
	}
	
	public int calcBucket (int keyValue) {
		return (keyValue % buckets.length);
	}
	
	public boolean addEmployee(EmployeeInfo subject) {
		try {
			int index = calcBucket(subject.getNum());
			//System.out.println("Adding " + subject.getFirst() + ":" + subject.getNum() + " to " + index + ".");
			buckets[index].add(subject);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public EmployeeInfo searchEmployee(int employeeNum) {
		int bIndex = -1;
		int sIndex = -1;
		for (ArrayList<EmployeeInfo> bucket : buckets) {
			bIndex++;
			for (EmployeeInfo employee : bucket) {
				sIndex++;
				if (employeeNum == employee.getNum()) {
					System.out.println("Found employee " + sIndex + " at bucket " + bIndex);
					return employee;
				}
			}
		}
		return null;
	}
	
	public EmployeeInfo removeEmployee (int target) {
		for (ArrayList<EmployeeInfo> bucket : buckets) {
			for (EmployeeInfo employee : bucket) {
				if (target == employee.getNum()) {
					EmployeeInfo grab = employee;
					bucket.remove(employee);
					return grab;
				}
			}
		}
		return null;
	}
	
	public void displayContents () {
		int index = -1;
		for (ArrayList<EmployeeInfo> bucket : buckets) {
			index++;
			System.out.print("Bucket " + index + " [");
			for (int i = 0; i < bucket.size(); i++) {
				System.out.print(bucket.get(i).getNum() + (i == bucket.size() - 1 ? "]" : ", " ));
			}
			System.out.println();
		}
	}
}
