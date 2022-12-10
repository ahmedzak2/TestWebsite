package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    WebDriver driver;
private  By figurebox= By.className("figure");
private By boxCaption = By.className("figcaption");
    public Hovers(WebDriver driver) {
        this.driver = driver;
    }
/*
* to hover on one of image to show the data
* we import actions library to know more about the elements
 */
    public FigureCaption hoverFristimage(int index){
        /*
        * it take webdriver element
        * */

        Actions actions = new Actions(driver);
        WebElement figures = driver.findElements(figurebox).get(index-1);
        // use perform to make it execute
actions.moveToElement(figures).perform();

return new  FigureCaption(figures.findElement(boxCaption));

    }

    public class FigureCaption {
        private WebElement caption;
        private By haeder = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption (WebElement caption ){
            this.caption=caption;
        }
        public Boolean isCaptionDisplayed(){
            // this is interaction method which diplayed on web elemnt
            return caption.isDisplayed();
        }
        public String gettTitle(){
            return caption.findElement(haeder).getText();
        }
        public String getLink(){
             // we use getAttribute  because href is attribute so we use it  to return the link
            return caption.findElement(link).getAttribute("href");

        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }

    }

}
