package StepDefiniation;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {

	
	@Given("user should open  web application")
	public void user_should_open_web_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user should enter following test data into feild")
	public void user_should_enter_following_test_data_into_feild(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		List<String> li = dataTable.asList();
		String string = li.get(2);
		System.out.println(string);
		
		
		
		
		
		
	 
	}

	@Then("user should sign off the application")
	public void user_should_sign_off_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
