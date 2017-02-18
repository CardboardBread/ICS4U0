package employeedatabass;

import java.util.Random;

public class Employee {
	private int empNumber;
	private String firstName;
	private String lastName;
	private String sex;
	private String workLocation;
	
	public Employee () {
		Random rand = new Random();
		empNumber = rand.nextInt();
		firstName = rand.toString().substring(0, rand.toString().length() / 2);
		lastName = rand.toString().substring(rand.toString().length() / 2, rand.toString().length());
	}
	
	public Employee (int num, String... params) {
		empNumber = num;
		switch (params.length) {
		case 0:
			break;
		case 1:
			firstName = params[0];
			break;
		case 2:
			firstName = params[0];
			lastName = params[1];
			break;
		case 3:
			firstName = params[0];
			lastName = params[1];
			sex = params[2];
			break;
		case 4:
			firstName = params[0];
			lastName = params[1];
			sex = params[2];
			workLocation = params[3];
			break;
		}
	}
	
	public int getNum () { return empNumber; }
	public String getFirst () { return firstName; }
	public String getLast () { return lastName; }
	public String getSex  () { return sex; }
	public String getWorkLoc () { return workLocation; }
	
	public void setFirst (String value) { firstName = value; }
	public void setLast (String value) { lastName = value; }
	public void setWork (String value) { workLocation = value; }
	public void setNum (int value) { empNumber = value; }
}
