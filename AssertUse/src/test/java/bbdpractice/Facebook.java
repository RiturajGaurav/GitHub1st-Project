package bbdpractice;

import bbdpractice1.FbLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Facebook 
{	
	
	FbLogin fblogin = new FbLogin();
	
	@Given("^user has to be on login page$")
	public void user_has_to_be_on_login_page() throws Throwable
	{
		fblogin.Setup();
		fblogin.OpenURL();
	}
	
	@When("^enter validusername and valid password and click login$")
	public void enter_validusername_and_valid_password_and_click_login() throws Throwable
	{
		fblogin.login("rgaurav.5555@gmail.com", "lucky@1233");
	}
	
	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable
	{
		fblogin.validatesuccessfullogin();
	}
	
	/*
	 * @When("^enter valid (.+) username and invalid (.+) password and click login$"
	 * ) public void enter_valid_and_invalid_and_click_login(String username, String
	 * password) throws Throwable { fblogin.login(username, password); }
	 * 
	 * @Then("^should display error message$") public void
	 * should_display_error_message() throws Throwable {
	 * fblogin.validateerrormessage(); }
	 */
}
	