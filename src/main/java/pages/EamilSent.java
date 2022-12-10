package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EamilSent {
    private WebDriver driver;
    private By contentArea = By.id("content");

    public EamilSent(WebDriver driver) {

        this.driver = driver;
    }
    public String getMessage(){
        return driver.findElement(contentArea).getText();
    }
}
