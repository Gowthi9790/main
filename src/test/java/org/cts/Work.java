package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Work {
	public static void main(String[] args) {	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("gowtham");
		driver.findElement(By.id("pass")).sendKeys("gowtham1233");
		driver.findElement(By.name("login")).click();
	}

}
