package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {
    WebDriver driver;

    public Frames(WebDriver driver) {
        this.driver = driver;
    }
    private void clickLink(String lintText){
        driver.findElement(By.linkText(lintText)).click();
    }

    public NestedFrames clickonNestedFrame(){
        clickLink("Nested Frames");
        return new NestedFrames(driver);
    }
}
