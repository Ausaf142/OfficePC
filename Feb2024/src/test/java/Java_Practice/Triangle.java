package Java_Practice;

public class Triangle extends Area  {
int base;int height;

public Triangle(int length,int width,int base,int height) {
	super(length,width);
	this.base=base;
	this.height=height;
}


public int AreaTrinagle() {
	int arTri=(base*height)/2;
	System.out.println(arTri);
	return arTri;
}
public void totalArea() {
int Tarea=Area()+AreaTrinagle();
System.out.println(Tarea);
}




public static void main(String[] args) {
	Triangle t =new Triangle(10,10,10,20);
	t.totalArea();
	
}
}
