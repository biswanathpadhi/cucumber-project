package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberStepDefinitions {

	@Given("user has installed uber app")
	public void user_has_installed_uber_app() {
		System.out.println("Backgroup Step: User has installed uber app");

	}

	@Given("I have opened the uber app for car booking")
	public void i_have_opened_the_uber_app_for_car_booking() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1: i_have_opened_the_uber_app_for_car_booking");
	}

	@Given("I enter souce as {string} and destination as {string}")
	public void i_enter_souce_as_and_destination_as(String source, String destination) {
		System.out.println("Step 2: i_have_opened_the_uber_app_for_car_booking with (source, destination = " + source
				+ ", " + destination + ")");

	}

	@When("I click BookCab and select")
	public void i_click_book_cab_and_select() {
		System.out.println("Step 3: ");

	}

	@Then("Car booking should be done")
	public void car_booking_should_be_done() {
		System.out.println("Step 4: ");

	}

}
