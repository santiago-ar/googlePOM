package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage extends BasePage {

    @FindBy(id = "firstHeading")
    WebElement titleResult;

    public WikiPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void waitForTitleWiki(){
        waitVisibility(titleResult);
    }
}
