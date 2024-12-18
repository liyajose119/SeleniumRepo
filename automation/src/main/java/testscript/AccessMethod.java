package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethod extends Base{
	
	public void parent() {
	//button[@id='button-one']//parent::form	
WebElement locateparent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form	"));	
	}
	
	public void child() {}
	//div[@id='collapsibleNavbar//child::form
	WebElement locatechild=driver.findElement(By.xpath("//button[@id='button-one']//child::ul	"));
	
	public void followingSibling() {}
	//button[@id='button-one']//following-sibling::div
	WebElement followingsibling=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div	"));
	
	public void following() {}
	//button[@id='button-one']//following::div[@id='message-two']
WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']	"));
	
	public void preceeding() {}
	//button[@id='button-one']//preceding::div[@class='header-top']
	WebElement preceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']	"));
		
	public void ancestor() {}
	//button[@id='button-one']//ancestor::div[@class='container page']
	WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']	"));
	
	public void descendant() {
	//div[@id='collapsibleNavbar']//descendant::li)
WebElement descendant=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::li)	"));
	}
	public void indexing() {
WebElement indexing=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::li)[1]	"));		
	}
}