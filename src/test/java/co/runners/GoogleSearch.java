package co.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/google_search.feature",
        glue= "co.stepdefinitions",
        snippets = SnippetType.CAMELCASE
        )
public class GoogleSearch {
}
