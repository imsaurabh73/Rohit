package com.cjc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DemoSikuli 
{
    static WebDriver driver;

	public static void main(String[] args) throws FindFailed 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\testing classes\\external jar files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://visionstudy.in/login");
		
		Screen s=new Screen();
		
		Pattern email=new Pattern("C:\\Users\\Zenith\\Desktop\\Sikuli\\email1.PNG");
		s.type(email, "s");
		
		Pattern pass=new Pattern("C:\\Users\\Zenith\\Desktop\\Sikuli\\pass.PNG");
		s.type(pass, "asdkjg");
	}
}
