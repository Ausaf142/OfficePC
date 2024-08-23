package POM_Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy (name="user_name") 
	WebElement Username;
	
	@FindBy(name="user_password")
	WebElement Password;

	@FindBy(id="submitButton")
	WebElement SubmitButton;
	
	public void Login_Vtiger(String USER,String PASS) throws IOException {
	
		Username.sendKeys(USER);
		Password.sendKeys(PASS);
		SubmitButton.click();
	}
	
	
	
}
