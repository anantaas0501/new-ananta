package com.hrm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Testbase {

	
	public static WebDriver d;
	public static void initialization(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91885\\ananta\\chromedriver.exe");	
			d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
	
	
		
		
	}
	
}
	

	
	
	
	
	
	
	


