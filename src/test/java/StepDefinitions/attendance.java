package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.attendancefn;

public class attendance {
	private String title;
	private WebDriver driver;
	attendancefn Objattendance = new attendancefn(driver);
	


@Given("Admin or User or Staff Logged on to LMS Website")
public void admin_or_user_or_staff_logged_on_to_lms_website() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
 
}

@When("Admin or User or Staff Clicks on Attendance button")
public void admin_or_user_or_staff_clicks_on_attendance_button() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.ClicksonAttendancebutton();
}

@Then("Admin or User or Staff see header text as Manage Attendance")
public void admin_or_user_or_staff_see_header_text_as_manage_attendance() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedTitleName"));
 
}

@When("Admin or User or Staff is on Manage Attandance page")
public void admin_or_user_or_staff_is_on_manage_attandance_page() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.ClicksonAttendancebutton();
 
}

@Then("Admin or User or Staff see Footer text as In total there are {int} entries")
public void admin_or_user_or_staff_see_footer_text_as_in_total_there_are_entries(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.noOfPage();
}


@Then("Admin or User or Staff see the text as Showing {int} to {int} of {int} entries")
public void admin_or_user_or_staff_see_the_text_as_showing_to_of_entries(Integer int1, Integer int2, Integer int3) {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.noOfPagetype();
}


@Then("Admin or User or Staff see all paginator  buttons are Disabled")
public void admin_or_user_or_staff_see_all_paginator_buttons_are_disabled() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.Pagedisables();
}

@Given("User or Staff is on Manage Attendance page")
public void user_or_staff_is_on_manage_attendance_page() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
}

@When("User or Staff Clicks on Edit buttons")
public void user_or_staff_clicks_on_edit_buttons() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickEdit();
}

@Then("Admin see header text as Attendance Details")
public void admin_see_header_text_as_attendance_details() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedTitleName"));
}

@Given("User or Staff Click on Edit page")
public void user_or_staff_click_on_edit_page() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
}

@When("User or Staff clicks on Save button after changing Program Name")
public void user_or_staff_clicks_on_save_button_after_changing_program_name() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickSave();
}

@Then("User or Staff see the success messageone Updated Successfully")
public void user_or_staff_see_the_success_messageone_updated_successfully() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@Given("User or Staff Clicks on Edit button")
public void user_or_staff_clicks_on_edit_button() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
}

@When("User or Staff clicks on Save button after changing User name")
public void user_or_staff_clicks_on_save_button_after_changing_user_name() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickSave();
}

@Then("User or Staff see the success messagetwo Updated Successfully")
public void user_or_staff_see_the_success_messagetwo_updated_successfully() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@When("User or Staff clicks on Save button after disabling Present details")
public void user_or_staff_clicks_on_save_button_after_disabling_present_details() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickSave();
}

@Then("User or Staff see the success messagethree Updated Successfully")
public void user_or_staff_see_the_success_messagethree_updated_successfully() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@When("User or Staff clicks on Save button after enabling Absent details")
public void user_or_staff_clicks_on_save_button_after_enabling_absent_details() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickSave();
}

@Then("User or Staff see the success messagefour Updated Successfully")
public void user_or_staff_see_the_success_messagefour_updated_successfully() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@When("User or Staff clicks on Cancel button after entering details")
public void user_or_staff_clicks_on_cancel_button_after_entering_details() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickCancel();
}

@Then("User or Staff see a Attendance Details window getting closed")
public void user_or_staff_see_a_attendance_details_window_getting_closed() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("title"));
}

@Given("Admin is on Manage Attendance page")
public void admin_is_on_manage_attendance_page() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
}

@When("Admin Clicks on Edit button")
public void admin_clicks_on_edit_button() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickEdit();
}

@Then("Admin see Err or  Message Admin Has View Only Permission")
public void admin_see_err_or_message_admin_has_view_only_permission() {
    // Write code here that turns the phrase above into concrete actions
	//title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@When("User or Staff Clicks on Delete button")
public void user_or_staff_clicks_on_delete_button() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickDelete();
}

@Then("Admin see header text as Delete Confirm")
public void admin_see_header_text_as_delete_confirm() {
    // Write code here that turns the phrase above into concrete actions
	//title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@Given("User or Staff Clicks on Delete Confirm")
public void user_or_staff_clicks_on_delete_confirm() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
}

@When("User or Staff Clicks on Yes button")
public void user_or_staff_clicks_on_yes_button() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickYes();
}

@Then("User or Staff see Success message Program Deleted Succesfully")
public void user_or_staff_see_success_message_program_deleted_succesfully() {
    // Write code here that turns the phrase above into concrete actions
	title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@Given("User or Staff Clicks on Delete option")
public void user_or_staff_clicks_on_delete_option() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
	}

@When("User or Staff Clicks on No button")
public void user_or_staff_clicks_on_no_button() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickNo();
}

@Then("User or Staff can see Program Name not deleted")
public void user_or_staff_can_see_program_name_not_deleted() {
    // Write code here that turns the phrase above into concrete actions
	//title = driver.getTitle();
	Assert.assertTrue(title.contains("expectedMsg"));
}

@When("Admin Clicks on Delete button")
public void admin_clicks_on_delete_button() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.clickDelete();
}

@Given("Admin or User or Staff is on Manage Attendance page")
public void admin_or_user_or_staff_is_on_manage_attendance_page() {
    // Write code here that turns the phrase above into concrete actions
	//it calls Application hooks to invoke browser
}

@When("Admin or User or Staff Clicks on Checkbox")
public void admin_or_user_or_staff_clicks_on_checkbox() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.ClickCheckbox();
}

@Then("Admin or User or Staff see list of Users in that Program")
public void admin_or_user_or_staff_see_list_of_users_in_that_program() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(title.contains("expectedMsg"));
}

@When("Admin or User or Staff Clicks on Present")
public void admin_or_user_or_staff_clicks_on_present() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.ClickPresent();
}

@Then("Admin or User or Staff see the list of User Name who are Present")
public void admin_or_user_or_staff_see_the_list_of_user_name_who_are_present() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(title.contains("expectedMsg"));
}

@When("Admin or User or Staff Clicks on Absent")
public void admin_or_user_or_staff_clicks_on_absent() {
    // Write code here that turns the phrase above into concrete actions
	Objattendance.ClickAbsent();
}

@Then("Admin or User or Staff see the list of User Name who are Absent")
public void admin_or_user_or_staff_see_the_list_of_user_name_who_are_absent() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(title.contains("expectedMsg"));
}

}
