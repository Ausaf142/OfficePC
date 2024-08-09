package Generic_Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.google.common.io.Files;



public class Listner implements ITestListener {
	CurrentDate d= new CurrentDate();
	String dd=d.Random_Number();
	
	

	@Test
	public void onTestFailure(ITestResult result) {
		
		
		{
			String fail_mtd = result.getMethod().getMethodName();
			System.out.println("fail method is : "+fail_mtd);
			EventFiringWebDriver edriver = new EventFiringWebDriver(Base_Class.driver);
			File pic = edriver.getScreenshotAs(OutputType.FILE);
			try {
				File file =new File("./Fail"+dd+".png");
				Files.copy(pic, file);
			}
			
			catch(Throwable e){
				e.printStackTrace();
			}
		
	}
	
	
	}
	}
