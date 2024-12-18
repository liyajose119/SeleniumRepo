package com.testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class FrameHandling extends Base {
	
	public void frames() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	//iframe[@id='a077aa5e']
	WebElement iframe= driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(iframe);
	//img[@src='Jmeter720.png']
	WebElement image= driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	image.click();
	
	}
	
	public static void main(String[] args) {
		FrameHandling framehandling=new FrameHandling();
		framehandling.instalizeBrowser();
		framehandling.frames();

	}

}
