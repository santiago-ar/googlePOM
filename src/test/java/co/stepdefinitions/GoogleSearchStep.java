package co.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.GoogleHome;
import pages.Results;
import utils.Generator;

public class GoogleSearchStep  {

    @Managed(driver = "chrome")
    public WebDriver webDriver;


    @Given("^Im on the homepage$")
    public void imOnTheHomepage() throws Exception {
       Generator.getInstance(GoogleHome.class,webDriver).goToGooglePage();
    }

    @When("^I do a search of (.*)$")
    public void iDoASearchOf(String search) throws Exception {
        Generator.getInstance(GoogleHome.class,webDriver).searchGoogleTextBox(search);

    }

    @Then("^the first result is (.*)$")
    public void theFirstResultIs(String result) throws Exception{
        Assert.assertThat(result, CoreMatchers.containsString(Generator.getInstance(Results.class,webDriver).getResultText()));
    }

    @When("^I click on the first result link$")
    public void iClickOnTheFirstResultLink() throws Exception {
        Generator.getInstance(Results.class,webDriver).clickOnFirstResult();
    }


}
