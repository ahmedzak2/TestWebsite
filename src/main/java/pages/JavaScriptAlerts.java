package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {
    WebDriver driver;

    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerconfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPOPButton = By.xpath(".//button[text()='Click for JS Prompt']");
private By result = By.id("result");
    public void trigeerAlret(){
        driver.findElement(triggerAlertButton).click();
    }
    public void confirmAlret(){
        driver.findElement(triggerconfirmButton).click();

    }
public void  prometAlret(){
    driver.findElement(triggerPOPButton).click();

}
public void alretSendMessage(String text){
    driver.switchTo().alert().sendKeys(text);
    }


    /**
     * i don't need to create class because there method for alret
     */
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
public String findResult(){
        return driver.findElement(result).getText();
}
public void closeAlret(){
        driver.switchTo().alert();
}
public String alretGetText(){
    return driver.switchTo().alert().getText();
}
    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public JavaScriptAlerts(WebDriver driver) {
        this.driver = driver;
    }


}
