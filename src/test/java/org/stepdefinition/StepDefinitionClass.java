package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass {
	WebDriver driver;
	@Given("User must be in chrome browser")
	public void user_must_be_in_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	    
	}

	@Given("User should pass the url")
	public void user_should_pass_the_url() {
		driver.get("https://www.facebook.com/");
	    
	}

	@When("user should enter values in username fields")
	public void user_should_enter_values_in_username_fields() {
	    WebElement uname = driver.findElement(By.id("email"));
	    uname.sendKeys("sasi");
	}

	@When("user Shouldd enter values in password field")
	public void user_Shouldd_enter_values_in_password_field() {
		  WebElement pass = driver.findElement(By.id("pass"));
		    pass.sendKeys("sasi");
	}

	@Then("user must be in login page")
	public void user_must_be_in_login_page() {
		WebElement login = driver.findElement(By.id("login"));
	    login.click();
	}



}
