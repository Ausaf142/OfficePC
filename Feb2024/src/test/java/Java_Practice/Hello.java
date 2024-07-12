package Java_Practice;

public class Hello extends Person {
	int ph;
public Hello(String name,int age,int ph,double radius) {
	super(name,age,radius);
	this.ph=ph;
	
}
public void detailWithPh() {
	System.out.println("name : "+name+" "+"age : "+age);
	System.out.println("phone : "+ph);
}
public static void main(String[] args) {
	Hello p =new Hello("hime",22,45874,5);
	p.detailWithPh();
}
}
