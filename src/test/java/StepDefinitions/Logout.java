package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.LogoutFn;
import Pages.attendancefn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	private String title;
	private WebDriver driver;
	LogoutFn ObjLogout = new LogoutFn(driver);

@Given("Admin or User or Staff Logged on to LMS website")
public void admin_or_user_or_staff_logged_on_to_lms_website() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser

 }

@When("Admin or User or Staff Clicks on LogOut button")
public void admin_or_user_or_staff_clicks_on_log_out_button() {
    // Write code here that turns the phrase above into concrete actions
	ObjLogout.ClickLogOutButton();
 }

@Then("Admin or User or Staff should be navigated to Login Screen")
public void admin_or_user_or_staff_should_be_navigated_to_login_screen() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedTitleName"));
 }


}
