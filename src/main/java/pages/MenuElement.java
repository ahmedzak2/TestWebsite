package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElement {
    public MenuElement(WebDriver driver) {
        this.driver = driver;
    }
    public int countLinks (){
        List<WebElement> number = driver.findElements(By.tagName("a"));
        System.out.println(number.size());
        return number.size();
    }

    private WebDriver driver;

}
