package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void click(WebElement element) {
        element.click();
    }
    public String getTextElement(WebElement element) {
        waitVisibility(element);
        if (element.getText().isEmpty()) {
            return null;
        } else {
            return element.getText();
        }
    }
    public void writeText(WebElement element, String word) {
        element.sendKeys(word);
    }

    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}