package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public static void main(String[] args) {

	}

public void id() {
	//WebElement elementname=driver.findElement(By.Locator("locator value"));
	WebElement a=driver.findElement(By.id("single-input-field"));
	WebElement b=driver.findElement(By.id("button-one"));
	WebElement c=driver.findElement(By.id("collapse navbar-collapse"));
	WebElement d=driver.findElement(By.id("message-one"));
}
public void className() {
	WebElement e=driver.findElement(By.className("clearfix"));
	WebElement f=driver.findElement(By.className("header-top"));
	WebElement g=driver.findElement(By.className("mb-sec"));
}
public void name() {
	WebElement h=driver.findElement(By.name("keywords"));
	WebElement i=driver.findElement(By.name("description"));
	WebElement j=driver.findElement(By.name("viewport"));
	
}
public void linkText() {
	WebElement k =driver.findElement(By.linkText("Simple Form Demo"));
	WebElement l=driver.findElement(By.linkText("Jquery Select2"));
	WebElement m=driver.findElement(By.linkText("Select Input"));
}
public void partiaLinkText() {
	WebElement n =driver.findElement(By.partialLinkText("Simple Fo"));
	WebElement o=driver.findElement(By.partialLinkText("Radio Bu"));
	WebElement p=driver.findElement(By.partialLinkText("Ajax Fo"));
}

}
	