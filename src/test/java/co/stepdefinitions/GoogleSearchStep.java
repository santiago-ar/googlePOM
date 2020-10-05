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
import pages.WikiPage;
import utils.Generator;

public class GoogleSearchStep  {

    @Managed(driver = "chrome")
    public WebDriver webDriver;


    @Given("^Im on the homepage$")
    public void imOnTheHomepage() throws Exception {
       Generator.getInstance(GoogleHome.class,webDriver).goToGooglePage();
    }

     @Then("^the first result is (.*)$")
    public void theFirstResultIs(String result) throws Exception{
        Assert.assertThat(result, CoreMatchers.containsString(Generator.getInstance(Results.class,webDriver).getResultText()));
    }

    @When("^I click on the first result link$")
    public void iClickOnTheFirstResultLink() throws Exception {
        Generator.getInstance(Results.class,webDriver).clickOnFirstResult();
    }

    @When("^the suggestions list is displayed$")
    public void theSuggestionsListIsDisplayed() throws Exception {
        Generator.getInstance(GoogleHome.class,webDriver).waitSuggestion();
    }

    @When("^I click on the first suggestion in the list$")
    public void iClickOnTheFirstSuggestionInTheList() throws Exception {
        Generator.getInstance(GoogleHome.class,webDriver).clickOnFirstSuggestion();
    }


    @When("^I type (.*) into the search field$")
    public void iTypeTheNameOfTheWindIntoTheSearchField(String search) throws Exception {
        Generator.getInstance(GoogleHome.class,webDriver).searchGoogleTextBox(search);
    }

    @When("^I click the Google Search button$")
    public void iClickTheGoogleSearchButton() throws Exception {
        Generator.getInstance(GoogleHome.class,webDriver).clickOnSearch();

    }

    @Then("^I go to page$")
    public void iGoToThePatrickRothfussTheBooksPage() throws Exception {
        Generator.getInstance(WikiPage.class,webDriver).waitForTitleWiki();
    }
}
