package Letz_Begin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* get
 * getwindowhandl
 * getwindowhandles
 * getPageSource
 * gettitle
 * navigate
 * manage
 * close
 * quite
 * switch
 * findelement
 * findelements
 * getCurrentURl
 * */


public class WebDriver_Methods {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
//	System.out.println(driver.getPageSource());
//	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getTitle());
	
	driver.close();
//	driver.quit();
	
}
}
