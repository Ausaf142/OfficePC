package FirstPackage;

import org.testng.annotations.Test;
//if in @test there is no any preference then it will execute according to its method name alphabetically	
//now attributes will be used for different execution such as 
public class AttributesInTestNG {
@Test (groups = "regression")
public void myName() {
	System.out.println("This is AUSAF ");
}
@Test (groups = "smoke")
public void yourName() {
	System.out.println("This is ADEEB ");
}
@Test (enabled = true) 
public void herName() {
	System.out.println("This is SOFI ");

}
}
