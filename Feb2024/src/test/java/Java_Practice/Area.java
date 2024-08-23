package Java_Practice;

public class Area extends Rectangle {
	public Area(int length,int width) {
		super(length,width);
	}
	
public void ColwithArea(String color) {
	System.out.println("Rectangle : "+color);
	int a = length*width;
	System.out.println(a);
	
}
public static void main(String[] args) {
Area ar = new Area(5,5);
ar.ColwithArea("Red");

	
}

}
