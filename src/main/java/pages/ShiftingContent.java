package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContent {
    private WebDriver driver;

    public ShiftingContent(WebDriver driver) {
        this.driver = driver;
    }

    private  By menu = By.linkText("Example 1: Menu Element");
    private  By image = By.linkText("Example 2: An image");
    private  By list = By.linkText("Example 3: List");

    public MenuElement clickMenu (){
        driver.findElement(menu).click();
        return new MenuElement(driver);
    }
    public Images clickImage (){
        driver.findElement(image).click();
        return new Images(driver);
    }
    public List clickList (){
        driver.findElement(list).click();
        return new List(driver);
    }
}
