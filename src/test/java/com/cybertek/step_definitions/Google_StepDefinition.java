package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Locale;

public class Google_StepDefinition {

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
       String actual = Driver.getDriver().getTitle();
       String expected = "Google";

       Assert.assertTrue(actual.equals(expected));

    }

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");
    }


    @When("User search for apple")
    public void user_search_for_apple() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple"+ Keys.ENTER);

    }


    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
      String actualTitle = Driver.getDriver().getTitle();
      String expectedInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
}
