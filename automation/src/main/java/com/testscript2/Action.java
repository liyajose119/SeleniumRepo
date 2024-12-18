package com.testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Action extends Base {

	
	
public void drag () {	
	//click,double click,context click,move to element
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	//span[text()='Draggable n°1']
WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	//div[@id='mydropzone']
WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));

Actions actions=new Actions(driver);
actions.moveToElement(drop).build().perform();
actions.doubleClick(drop).build().perform();
actions.contextClick(drag).build().perform();
actions.dragAndDrop(drag, drop).build().perform();
}
	public static void main(String[] args) {
		Action action=new Action();
		action.instalizeBrowser();
		action.drag();
	

	}

}
