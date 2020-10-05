package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Results extends BasePage {

    @FindBy(xpath = "//*[@data-local-attribute='d3bn']")
    WebElement titleResult;

    @FindBy(xpath = "  (//*[@class='LC20lb DKV0Md'])[1]")
    WebElement firstResult;


    public Results(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getResultText() {
        return getTextElement(titleResult);
    }

    public void clickOnFirstResult() {
        waitVisibility(firstResult);
        click(firstResult);
    }
}
