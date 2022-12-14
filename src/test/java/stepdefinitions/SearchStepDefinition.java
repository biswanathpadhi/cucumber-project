package stepdefinitions;

import org.junit.Assert;

import implementation.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
	
	Product product = null;

	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i_have_a_search_field_on_amazon_page");
	}

	@When("I search for a product with name {string} and price {string}")
	public void i_search_for_a_product_with_name_and_price(String productName, String productPrice) {
		System.out.println("i_search_for_a_product_with_name_and_price");
		product = new Product(productName, productPrice);
		
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("product_with_name_should_be_displayed");
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(product.getListOfProductName().contains(productName));
	}
}
