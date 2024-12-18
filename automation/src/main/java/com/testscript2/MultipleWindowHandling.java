package com.testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleWindowHandling extends Base {
	
	public void multipleWindowHndle() {
		driver.navigate().to("https://webdriveruniversity.com/");
		// getWindowhandle() and getWindowHandles()
//h1[text()='CONTACT US']
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println("***************************************************************");
		Set<String> allWindows=driver.getWindowHandles();
		for(String temp:allWindows) {
			System.out.println("windows"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("***************************************************************");
		}
		
			
	
	}

	
	public static void main(String[] args) {
		MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
		multiplewindowhandling.instalizeBrowser();
		multiplewindowhandling.multipleWindowHndle();
}
}