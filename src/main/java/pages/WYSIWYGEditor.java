package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditor {
WebDriver driver;
private String editorIFrame = "mce_0_ifr";
//private WebElement test = (WebElement) By.id("mce_0_ifr");
private By body = By.id("tinymce");
private  By decreaseIndentButton = By.cssSelector("#content > div > div > div.tox-editor-container > div.tox-editor-header > div.tox-toolbar-overlord > div > div:nth-child(5) > button:nth-child(2)");
// private By decreaseIndentButton = By.xpath("//button[text()='Increase indent']");

//    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");
    public WYSIWYGEditor(WebDriver driver) {
        this.driver = driver;
    }
    public void clearBody(){
        switchToaddArea();
        driver.findElement(body).clear();
        swithTOparent();
    }
    public void enterText(String text){
        switchToaddArea();
        driver.findElement(body).sendKeys(text);
    swithTOparent();
    }
    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
public String getTextFromEditor(){
        switchToaddArea();
      String text=  driver.findElement(body).getText();
        swithTOparent();
    return text;
}

    private void switchToaddArea(){
        //driver.switchTo().frame(test);
driver.switchTo().frame(editorIFrame);
    }
    private void swithTOparent(){
        driver.switchTo().parentFrame();
    }

}
