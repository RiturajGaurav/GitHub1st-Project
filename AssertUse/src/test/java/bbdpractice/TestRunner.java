package bbdpractice;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/bbdpractice/Facebook.feature"},
		glue = {"bbdpractice"},
		tags ="@Login"
		)
public class TestRunner 
{


}
