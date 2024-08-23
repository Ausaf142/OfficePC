package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DDT_PropertyFile {
@Test
public void propertFile() throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Use the property file for the property ddt
	FileInputStream fis = new FileInputStream("./Credential.property");
	Properties prop = new Properties();
	prop.load(fis);
	String USER = prop.getProperty("username");
	String pwd = prop.getProperty("password");
	System.out.println(USER);
	System.out.println(pwd);
	
	
	
}
}
