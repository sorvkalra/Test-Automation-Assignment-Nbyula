package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
	
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\sorvk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nbl.one/gigs/listings/careers1/chitkara-university-campus-hiring-software-test-engineer-internship-1");
		driver.findElement(By.linkText("Book My Seat")).click();
		
	}
	
}