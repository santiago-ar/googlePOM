package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome extends BasePage {
    @FindBy(xpath="//*[@name='q']")
    WebElement textBox;

    @FindBy(xpath = "(//input[@name=\"btnK\"])[2]")
    WebElement searchButton;

    @FindBy(xpath = "(//*[@class='sbl1'])[1]")
    WebElement suggestion;

    public GoogleHome(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public GoogleHome goToGooglePage(){
        String URL = "https:www.google.com";
        driver.manage().window().maximize();
        driver.get(URL);
        return this;
    }

    public void searchGoogleTextBox(String text){
        waitVisibility(textBox);
        writeText(textBox,text);

    }
    public void clickOnSearch(){
        click(searchButton);
    }

    public void clickOnFirstSuggestion(){
        click(suggestion);
    }

    public void waitSuggestion(){
        waitVisibility(suggestion);
    }

}
