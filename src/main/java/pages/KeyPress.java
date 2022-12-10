package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPress {
    WebDriver driver;

    public KeyPress(WebDriver driver) {
        this.driver = driver;
    }
    private By  inputField = By.id("target");
    private By result = By.id("result");
    public void sendCharacter(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public  void enterPI(){
        //use chord to send multply keys on same time
        sendCharacter(Keys.chord(Keys.ALT,"p"+"=3.14"));

    }
    public String getResult(){
     return    driver.findElement(result).getText();
    }

}
