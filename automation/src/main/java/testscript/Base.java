package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
public class Base {
public WebDriver driver;
	public static void main(String[] args) {
		
Base base =new Base();
base.instalizeBrowser();
base.driveQuitAndClose();
	}
public void instalizeBrowser() {
	driver=new ChromeDriver();
	//driver=new EdgeDriver();
	//driver=new FirefoxDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	
}
public void driveQuitAndClose() {
	driver.close();
	//driver.quit();
}
}