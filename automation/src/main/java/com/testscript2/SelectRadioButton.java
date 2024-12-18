package com.testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class SelectRadioButton extends Base {
	
	public void isSelected () {
	//input[@id='inlineRadio1']")
			driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioButton.click();
		if (radioButton.isSelected()) {
            System.out.println("Radio button is already selected");
        } else {
            radioButton.click();
            System.out.println("Radio button is selected now");
        }
	}
	public static void main(String[] args) {
		SelectRadioButton selectradiobutton=new SelectRadioButton ();
		selectradiobutton.instalizeBrowser();
		selectradiobutton.isSelected();
		//radiobutton.driveQuitAndClose();

	}

}
