package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSSelectors extends Base {

	public void cssSelectorsTagAndId() {
		WebElement tagid1 = driver.findElement(By.cssSelector("button#button-one"));//tag and ID
		WebElement tagid2=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagid3=driver.findElement(By.cssSelector("div#message-one"));	
	}
		
	public void cssSelectorsTagAndClass() {
		  WebElement tagclass1= driver.findElement(By.cssSelector("section.clearfix"));  //tag and class
		  WebElement tagclass2=driver.findElement(By.cssSelector("footer.mt-5"));
			WebElement tagclass3=driver.findElement(By.cssSelector("div.mb-sec"));
	}
	
	public void cssSelectorsTagAndAttribute() {
WebElement tagattribute1= driver.findElement(By.cssSelector("button[id='button-one')"));//tag and Attribute
WebElement tagattribute2=driver.findElement(By.cssSelector("div[id='message-one']"));
WebElement tagattribute3=driver.findElement(By.cssSelector("input[id='value-a']"));
	
		   }
	public void cssSelectorsTagClassAndAttribute() { //tag class and Attribute
		WebElement tagclassattribute1=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement tagclassattribute2=driver.findElement(By.cssSelector("div.my-2[id='message-one']"));
		WebElement tagclassattribute3=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
		
	}
	}
