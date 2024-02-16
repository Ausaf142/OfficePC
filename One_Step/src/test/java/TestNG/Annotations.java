package TestNG;

import org.testng.annotations.Test;

import GenericUtility.Base_Class_New;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
/*First priority is uppercase--if all upper case then alphabates--if all lowercase then alphabates
 * --if mix upper and lower then upper first then lower--if we provide annotion priority then first of all
 --after annotation all as it as above written*/

public class Annotations extends Base_Class_New
{

	@Test (priority=1,timeOut = 1)//srf single prority hai to others phle tb ye nahi to sabko seq me priority do
	public void ausaf() {
		System.out.println("ausaf");
	}
	@Test (priority=2,invocationCount = 2)
	public void adeeb() { 
		System.out.println("adeeb");
	}
	@Test (priority=3,enabled = true)
	public void Sheikh() {
		System.out.println("sheikh");
	} 
	@Test (priority=4,dependsOnMethods = "Sheikh")
	public void khan() {
		System.out.println("khan");
	}
	

}
