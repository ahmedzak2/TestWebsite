package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
  private    WebDriver driver;
    private By menu = By.id("hot-spot");


    public ContextMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnRightClick(){
        Actions actions = new Actions(driver);

        actions.contextClick(driver.findElement(menu)).perform();
    }
public String alert(){

       return driver.switchTo().alert().getText();
}
    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }

}
