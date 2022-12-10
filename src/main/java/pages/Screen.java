package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screen  {
    WebDriver driver;

    public Screen(WebDriver driver) {
        this.driver = driver;
    }
public WebElement  takeScreen(){
       var link=  driver.findElement(By.className("header-content"));
    System.out.println(link.getText());
return link;

    }

}
