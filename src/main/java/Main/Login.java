package Main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="./src\\main\\java\\feature\\login.feature",glue={"stepdefinition"})
public class Login {

	

}
