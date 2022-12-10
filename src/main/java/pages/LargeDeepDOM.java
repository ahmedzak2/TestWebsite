package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDOM {
    WebDriver driver;
private By table = By.id("large-table");
    public LargeDeepDOM(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollToTable(){
        WebElement tableELement =driver.findElement(table);
        // class selmuin provide to execute java script
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,tableELement);
    }
}
