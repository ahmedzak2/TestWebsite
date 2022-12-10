package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {
WebDriver driver;
private String leftFrame = "frame-left";
private By text = By.cssSelector("body");
private String bottom = "frame-bottom";
private String top = "frame-top";

//private By test =By.name("frame-left");
    public NestedFrames(WebDriver driver) {
        this.driver = driver;
    }
private void switchToTop(){
        driver.switchTo().frame(top);
}
    public String switchToLeftFrame(){
        switchToTop();
      driver.switchTo().frame(leftFrame);
      String text = getText();
        // to return to top frame  because the left is part of top
        // to return to main frame

        returnToMain();
      returnToMain();
      return text;
    }
    public void returnToMain(){
        driver.switchTo().parentFrame();
    }
    public String getText(){
       return driver.findElement(text).getText();
    }
    public String  switchToBottom (){
        driver.switchTo().frame(bottom);
        String text = getText();
        returnToMain();
return text;
    }

}
