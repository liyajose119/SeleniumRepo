package com.testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base {
	
	
	public void tablePrinting () {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//table[@id='dtBasicExample']
		WebElement table= driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());	
		
	}
	public void rowPrinting () {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//table[@id='dtBasicExample']//tbody//tr[1]
WebElement row= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
System.out.println(row.getText());
		
	}
	public void cellPrinting () {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//table[@id='dtBasicExample']//tbody//tr[1]//td[2]
	WebElement cell= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[2]"));	
	System.out.println(cell.getText());	
	}
	
	public void columnPrinting () {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//table[@id='dtBasicExample']//tbody//tr//td[1]
 List<WebElement> column1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	    for(WebElement temp:column1) {
	        System.out.println(temp.getText());
	    }
	}
	
//value in col 1 need to be checked and if its there it should be printed and o/p :both are same
	public void checkingData() {
	    driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	    String input = "Ashton Cox";
List<WebElement> column1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	    for (WebElement temp : column1) {
	        if (temp.getText().equals(input)) {
	            System.out.println(temp.getText());
	            System.out.println("Both are same");
	        }
	    }
	}

	//print col Position
	//+Check whether there is value named Senior Javascript developer
	//+print 6th row
	//+print san francisco
	//public void dataPrinting
	
		public static void main(String[] args) {
			TableHandling tablehandling=new TableHandling();
			tablehandling.instalizeBrowser();
			//tablehandling.tablePrinting();
			//tablehandling.rowPrinting ();
			//tablehandling.cellPrinting();
			//tablehandling.columnPrinting();
			tablehandling.checkingData();
	}
}
