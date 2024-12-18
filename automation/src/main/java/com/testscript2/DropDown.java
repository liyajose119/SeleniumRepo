package com.testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDown extends Base {
	//value, index, visible text
	
	public void visibleText() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		//select[@id='single-input-field']
		WebElement down= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select (down);
		select.selectByVisibleText("Red");
		
	}
	public void index () {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		//select[@id='single-input-field']
		//x path-//tag[@attribute='value']
		WebElement down= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select (down);
		select.selectByIndex(3);
				
	}

	public void value () {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		//select[@id='single-input-field']
		WebElement down= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select (down);
		select.selectByValue("Green");
					
	}
	
	public static void main(String[] args) {
		DropDown dropdown=new DropDown();
		dropdown.instalizeBrowser();
		//dropdown.visibleText();
		//dropdown.index();
		dropdown.value();
		

	}

}
