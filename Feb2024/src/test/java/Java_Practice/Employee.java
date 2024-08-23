package Java_Practice;

public class Employee {
private int salary;
private String date;
public Employee(int salary,String date) {
	this.salary=salary;
	this.date=date;
}
public void work() {
	System.out.println("employee are getting "+salary);
}


public int getSalary() {
	return salary;
}
public String opening() {
	System.out.println("available : "+date);
	return date;
}

}
