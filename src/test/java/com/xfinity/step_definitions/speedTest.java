package com.xfinity.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.xfinity.utiities.Config;
import com.xfinity.utiities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class speedTest {
	WebDriver driver;

	@Given("^The user Sets Implicit wait to (\\d+) seconds$")
	public void the_user_Sets_Implicit_wait_to_seconds(int arg1) throws Throwable {
		driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^The user Navigate to http://speedtest\\.xfinity\\.com/$")
	public void the_user_Navigate_to_http_speedtest_xfinity_com() throws Throwable {
		driver.get(Config.getProperty("url"));
	}

	@When("^The user Wait until Start Test button is clickable$")
	public void the_user_Wait_until_Start_Test_button_is_clickable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^The user Click on Start Test button$")
	public void the_user_Click_on_Start_Test_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^The user  Wait until Blinking Download icon disappears$")
	public void the_user_Wait_until_Blinking_Download_icon_disappears() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^The user  Read Download speed value into a variable$")
	public void the_user_Read_Download_speed_value_into_a_variable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^The user  Wait until Blinking Upload icon disappears$")
	public void the_user_Wait_until_Blinking_Upload_icon_disappears() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^The user  Read Upload speed value into a variable$")
	public void the_user_Read_Upload_speed_value_into_a_variable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^The user Set Following Conditions:$")
	public void the_user_Set_Following_Conditions() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
