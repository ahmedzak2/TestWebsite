package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
    private WebDriver driver;
    private By userName = By.id("username");
    private By password =By.id("password");
    private By loginButton = By.cssSelector("#login button");
    private By enter = By.className("radius");

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public By getUserName() {
        return userName;
    }

    public void setUserName(By userName) {
        this.userName = userName;
    }

    public By getPassword() {
        return password;
    }

    public void setPassword(By password) {
        this.password = password;
    }


public  LoginPage (WebDriver driver ){
        setDriver(driver);
}
public void  setUserName(String username){
        driver.findElement(userName).sendKeys(username);
}
public void  serPassowrd(String password1){
        driver.findElement(password).sendKeys(password1);
}
public SecureArea clickLoginbutton (){
        driver.findElement(loginButton).click();
return new SecureArea(driver);
}

}
