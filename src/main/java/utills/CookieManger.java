package utills;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManger {
    private WebDriver driver;

    public CookieManger(WebDriver driver) {
        this.driver = driver;
    }
    public void addCookie (Cookie cookie){
        driver.manage().addCookie(cookie);
    }
    public void deleteCookie(Cookie cookie){
        driver.manage().deleteCookie(cookie);

    }
    public boolean isDisplayed (Cookie cookie){
        return driver.manage().getCookieNamed(cookie.getName())!=null;

    }

    public Cookie setCookie(String name, String value ) {
        Cookie cookie = new Cookie.Builder(name ,value)
                // the website which we use cookie for
                .domain("the-internet.herokuapp.com")
                .build();
return cookie ;

    }
}
