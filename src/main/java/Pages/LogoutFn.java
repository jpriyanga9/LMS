package Pages;

import org.openqa.selenium.WebDriver;

public class LogoutFn {
	
static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public LogoutFn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void ClickLogOutButton() {
		//driver.findElement(ClicksonAttendancebutton).click();
		System.out.println("ClickLogOutButton is successful");
		}

}
