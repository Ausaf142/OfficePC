package Java_Practice;

public class Person extends Circle {
String name;
int age;
public Person(String name,int age,double radius) {
	super(radius);
	this.name=name;
	this.age=age;
}
public void detail() {
	System.out.println("name : "+name+" "+"age : "+age);
}

public static void main(String[] args) {
	Person p =new Person("hime",22,5);
	p.detail();
	p.AreaCircle();
}

}
