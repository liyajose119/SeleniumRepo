package testscript;

public class NavigationCommands extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigationcommands=new NavigationCommands ();
		navigationcommands.instalizeBrowser();
		navigationcommands.navigation();
		navigationcommands.driveQuitAndClose();
	}
public void navigation() {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
}
