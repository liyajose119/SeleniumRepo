package com.testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Checkbox extends Base {
	
	public void checkBoxselection () {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		//gridCheck
		WebElement check1=driver.findElement(By.id("gridCheck"));
		check1.click();
		
	}
	
	

	public static void main(String[] args) {
		Checkbox checkbox=new Checkbox ();
		checkbox.instalizeBrowser();
		checkbox.checkBoxselection();
		//radiobutton.driveQuitAndClose();

	}

}
