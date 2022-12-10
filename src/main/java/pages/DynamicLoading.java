package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
    WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By Link_Example2 = By.xpath(String.format(linkXpath_Format,"Example 2"));
    public DynamicLoading(WebDriver driver) {
        this.driver = driver;
    }

    public ElementHidden clickOnEelementHidden(){
        driver.findElement(link_Example1).click();
        return new ElementHidden(driver);
    }
    public ExampleElementRendered clickOnExmaple2(){
        driver.findElement(Link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new ExampleElementRendered(driver);

    }
    public ExampleElementRendered havorright(){
        driver.findElement(Link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
    return new ExampleElementRendered(driver);
    }
    private void clickLink(String lintText){
        driver.findElement(By.linkText(lintText)).click();
    }

}
