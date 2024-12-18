package com.testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButton extends Base {
	public void radioButtonHandling () {
		//input[@id='inlineRadio1']")
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radioButton.click();
	
		//button[@id='button-one']
	WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
	button.click();
		
	}
	

	public static void main(String[] args) {
	RadioButton radiobutton=new RadioButton ();
	radiobutton.instalizeBrowser();
	radiobutton.radioButtonHandling();
	//radiobutton.driveQuitAndClose();

	}

}
