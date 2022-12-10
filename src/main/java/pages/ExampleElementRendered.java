package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExampleElementRendered {
WebDriver driver;
    private By button = By.cssSelector("#start button");

    private By loadingPage = By.id("loading");
    private By loadedText = By.id("finish");
    public ExampleElementRendered(WebDriver driver) {
        this.driver = driver;
    }
    public void CLickStartRender(){
        driver.findElement(button).click();

        // to make it wait for 5 second max time to wait for condition the is true
      //  WebDriverWait wait = new WebDriverWait(driver,1);

        // to make wait until the element is shown
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedText)));
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
    public boolean isStartButtonDisplayed(){
        return driver.findElement(button).isDisplayed();
    }
}

