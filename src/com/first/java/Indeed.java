package com.first.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\johnq\\Desktop\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.indeed.com/");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Qulity Enginner");
		driver.findElement(By.name("l")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("l")).sendKeys("Oakland, CA");
		driver.findElement(By.id("fj")).click();
		System.out.println("The new title is - " + driver.getTitle());
		String title=driver.getTitle();
		//Validation point
		if(title.equals("Quality Engineer Jobs, Employment in Oakland, CA | Indeed.com")){
		
			System.out.println("Title is matched");
		}
		else{
			
		
			System.out.println("Title is not matched");
		}
		
		driver.quit();
		

	}

}
