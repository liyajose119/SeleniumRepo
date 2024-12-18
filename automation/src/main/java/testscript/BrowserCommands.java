package testscript;

public class BrowserCommands extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands =new BrowserCommands();
		browsercommands.instalizeBrowser();
		browsercommands.browserCommands();
		//browserCommands.driveQuitAndClose();
		
	}
public void browserCommands() {
	//String title=driver.getTitle();
	//System.out.println(title);
	//String url=driver.getCurrentUrl();
	//System.out.println(url);
	String page=driver.getPageSource();
	System.out.println(page);
}
}  
