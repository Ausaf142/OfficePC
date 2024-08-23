package Java_Practice;

public class Circle {
private double radius;
public Circle(double radius) {
	this.radius=radius;
}

public double getRadius(double radius) {
	return radius;
}

public void setRadius(double radius) {
	this.radius=radius;
}
public void AreaCircle() {
	double area =Math.PI*radius*radius;
	System.out.println(area);
}
public static void main(String[] args) {
	Circle c = new Circle(5);
	c.AreaCircle();
}
}
