package Letz_Begin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Sendkeys
 * clear
 * submit
 * isenable
 * isselected
 * getlocation
 * get size
 * click
 * isenable
 * displayed
 * getText
 * getCSS
 * getAttri*/


public class WebElements_Methods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Dimension newSize = new Dimension(800, 600);
	driver.manage().window().setSize(newSize);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
	driver.findElement(By.id("text1")).sendKeys("AYUSHI PRASAD");
	Thread.sleep(1000);
	driver.findElement(By.id("text1")).clear();
	WebElement ele = driver.findElement(By.id("text1"));
	System.out.println(ele.getLocation());
	System.out.println(ele.getSize());
	
	
	
	
	
	
}
}
