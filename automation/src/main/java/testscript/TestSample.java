package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSample extends Base{
public void gettext () {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	//enter message
	WebElement enterMessage=driver.findElement(By.id("single-input-field"));
	enterMessage.sendKeys("Liya");
	//show message
	WebElement button=driver.findElement(By.id("button-one"));
	button.click();
	
}
public void addNumbers () {
//Enter first number
	WebElement enterA=driver.findElement(By.id("value-a"));
	enterA.sendKeys("10");
	//Enter second number
	WebElement enterB=driver.findElement(By.id("value-b"));
	enterB.sendKeys("20");
	//click button
	WebElement getTotal=driver.findElement(By.id("button-two"));
	getTotal.click();
}

public static void main(String[]args) {
	TestSample testsample=new TestSample();
	testsample.instalizeBrowser();
	testsample.gettext();
	testsample.addNumbers();
	//testsample.driveQuitAndClose();
	
	}

}
