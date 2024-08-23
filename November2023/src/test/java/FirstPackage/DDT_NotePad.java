package FirstPackage;

import java.io.IOException;
import org.testng.annotations.Test;

import GenericUtility.Base;
import GenericUtility.Base_Class;
import GenericUtility.NotePad_Utility;
import POM_Classes.Login;

public class DDT_NotePad  extends Base_Class{
	@Test
public void DDTNote() throws IOException {
//	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get("http://localhost:8888/");
//	FileInputStream fis =new FileInputStream("./login.txt");
//	Properties pro =new Properties();
//	pro.load(fis);
//	String USER = pro.getProperty("user");
//	String PASS = pro.getProperty("pwd");
//	driver.findElement(By.name("user_name")).sendKeys(USER);
//	driver.findElement(By.name("user_password")).sendKeys(PASS);
//	driver.findElement(By.id("submitButton")).click();
		
	NotePad_Utility value=new NotePad_Utility(); 
	String un = value.DataFromNotePad("user");
	String pw = value.DataFromNotePad("pwd");
	Login lg=new Login(driver);
	lg.Login_Vtiger(un,pw);
	
}
}
