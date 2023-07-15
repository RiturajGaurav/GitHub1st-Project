package bbdpractice;

import bbdpractice1.FbLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook2 
{
	FbLogin fblogin = new FbLogin();
	
	@When("^enter valid (.+) and invalid (.+) and click login$")
	public void enter_valid_and_invalid_and_click_login(String username, String password) throws Throwable
	{
		fblogin.login(username, password);
	}
	
	@Then("^should display error message$")
	public void should_display_error_message() throws Throwable
	{
		fblogin.validateerrormessage();
	}
}
