package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDown {
    private WebDriver driver;
private By dropdown = By.id("dropdown");
   private By option1 = By.linkText("");
    public DropDown(WebDriver driver) {
        this.driver = driver;

    }
    public void selectFormDropdown(String option ){
// to pass element to select
    //dropdownElement.deselectByValue("1");
        findDropDownElement().selectByVisibleText(option);
    }
    /*
    * it should  list string not web-element  to make  sure  that retu
    * rn is text to make sure i don't mess with the frame class action
     */
    public List<String> getSelectoption (){
    List <WebElement> selecteditem= findDropDownElement().getAllSelectedOptions();
    /*
    * we use map to get the text of  the webelment    and  put it on new list by use  collectors
     */
    return selecteditem.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private  Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));

    }

}
