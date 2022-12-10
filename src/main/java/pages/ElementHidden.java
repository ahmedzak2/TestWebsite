package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementHidden {
    WebDriver driver;
private  By button = By.cssSelector("#start button");
private By loadingPage = By.id("loading");
   private By loadedText = By.id("finish");
    public ElementHidden(WebDriver driver) {
        this.driver = driver;
    }
    public void CLickStart(){
        driver.findElement(button).click();

        // to make it wait for 5 second max time to wait for condition the is true
    //    WebDriverWait wait = new WebDriverWait(driver,5);

        // to make wait until the element is shown
  //  wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingPage)));
        /* FLUENT WAIT */
//        FluentWait wait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingIndicator)));
    }
    public String getLoadedtext(){
        return driver.findElement(loadedText).getText();
    }



}
