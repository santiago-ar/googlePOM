package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class Generator {

    public static  <T extends BasePage> T getInstance (Class<T> pageClass , WebDriver driver ) throws Exception {
        try {
            return PageFactory.initElements(driver,  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
