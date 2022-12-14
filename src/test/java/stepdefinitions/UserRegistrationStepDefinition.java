package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationStepDefinition {

	@Given("user is on home page")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1");
	}

	@And("he enters below details")
	public void he_enters_below_details(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		System.out.println("Step 2");

		List<List<String>> dataRows = dataTable.asLists(String.class);

		for (List<String> dataRow : dataRows) {
			System.out.println(dataRow);
		}
	}

	@When("user click submit button")
	public void user_click_submit_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");
	}

	@Then("user should see home page")
	public void user_should_see_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4");
	}

	@Given("he enters below details with column name")
	public void he_enters_below_details_with_column_name(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> dataRowWithColumns = dataTable.asMaps();
		for (Map<String, String> data : dataRowWithColumns) {
			System.out.println("-------------------------------------------" + data);
		}
	}

	@Given("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("username = " + username);

		System.out.println("password = " + password);
	}

	@Given("user clicks on pay outstanding amount")
	public void user_clicks_on_pay_outstanding_amount() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step: user clicks on pay outstanding amount");
	}

	@Then("{double} should equal to sum of {double} and {double}")
	public void should_equal_to_sum_of_and(Double totalAmountToPay, Double totalAmount, Double totalTaxAmount) {
		// Write code here that turns the phrase above into concrete actions
		Double expectedAmount = totalAmount + totalTaxAmount;
		System.out.println("Expected Amount = " + expectedAmount);
		System.out.println("Actual Amount = " + totalAmountToPay);
		Assert.assertEquals(expectedAmount, totalAmountToPay);
	}

}
