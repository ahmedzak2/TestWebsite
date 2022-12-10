package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    WebDriver driver;

    // if i can't find element by id or class use ccs selector 
private By slide = By.cssSelector(".sliderContainer input");
private By input = By.id("input");
  private By range = By.id("range");
    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }
    public void sendArrrow (double index){
        for (int i =0; i<index*2;i++) {
            driver.findElement(slide).sendKeys(Keys.ARROW_RIGHT);
        }

    }
    public String returnResult(){
      return   driver.findElement(range).getText();
    }

}
