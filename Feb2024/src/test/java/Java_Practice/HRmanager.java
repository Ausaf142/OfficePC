package Java_Practice;

import java.util.Scanner;

public class HRmanager extends Employee {
	
	public HRmanager(int salary,String date) {
		super(salary,date);
	}
public void addEmployee() {
	System.out.println("add employee");
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENter the sal");
	int sal =sc.nextInt();
	Employee ee = new Employee(sal,"4556");
	HRmanager hm =new HRmanager(sal, "01-25-25");
	ee.work();
	hm.work();
	hm.opening();
	hm.addEmployee();
}
}
