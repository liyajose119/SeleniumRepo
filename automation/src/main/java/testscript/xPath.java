package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xPath extends Base {
	public void basicXpath () {
		//relative xpath
//		1.xpath  //tag[@attribute='value']
		//:select current node,@ select attribute
		//button[@id='button-one']
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one;]"));
		//input[@id=value-a']
		WebElement entervalue=driver.findElement(By.xpath("//input[@id='value-a']"));
		//input[@id=value-b']
		WebElement entervalueb=driver.findElement(By.xpath("//input[@id='value-b']"));
		
		
	}
		void contains() {
			   //tag[contains(@attribute,'value')]
			//button[contains(@id,'button-one')]
			WebElement button=driver.findElement(By.xpath("//button[contains@id,'button-one')]"));
			//button[contains(@id,'button-tw')]
			WebElement gettotal=driver.findElement(By.xpath("//button[contains@id,'button-tw')]"));
			//div[contains(@id,'message-one')]
			WebElement message=driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
			//div[contains(@id,'collapsibleNavbar')]
			WebElement Navbar=driver.findElement(By.xpath("//div[contains(@id,'collapsibleNavbar')]"));
		}
		public void startsWith() {
			//startsWith()  //tag[starts-with(@attribute,'value')]
			//button[starts-with(@id,'button-o')]
			WebElement button =driver.findElement(By.xpath("//button[startes-with@id,'button-o')]"));
			//input[starts-with(@id,'value-a')]
			WebElement valuea=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
			
		}
		public void textMethod() {
			//text()     //tag[text()='text']
			//button[text()='Show Message']
			WebElement button =driver.findElement(By.xpath("//button[text()='Show Message']"));
			//button[text()='Get Total']
			WebElement button2 =driver.findElement(By.xpath("//button[text()='Get Total']"));
					
			    
		}
		public void orMethod() {
			//  tag[@attribute='value' or @attribute='value']
WebElement or1 =driver.findElement(By.xpath("//div[@class='collapse navbar-collapse' or @ id='collapsible Navbar']"));
WebElement or2 =driver.findElement(By.xpath("//button[@id='button-one' or @class='btn btn-primary']"));
WebElement or3 =driver.findElement(By.xpath("//input[@id='value-a' or @class='form-control']"));

		}
		public void andMethod() {
WebElement and1 =driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']"));
WebElement and2 =driver.findElement(By.xpath("//input[@id='value-a' and @class='form-control']"));
WebElement and3 =driver.findElement(By.xpath("//div[@class='my-2' and @id='message-two']"));
		}
}
