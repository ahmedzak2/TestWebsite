package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public String getEmail() {
        return driver.findElement(By.id("email")).getAccessibleName();
    }

    public EamilSent preesbutton() {
        driver.findElement(By.id("form_submit")).click();
        return new EamilSent(driver);


    }
}
