package Java_Practice;

public class Rectangle {
	int length;int width;
	
public Rectangle(int length,int width) {
	this.length=length;
	this.width=width;
}
public  int Area() {
	int a =length*width;
	System.out.println(a);
	return a;
}
public void perimeter() {
	int p =2*(length+width);
	System.out.println(p);
}
}
