package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormAuthenication(){
        // to open the page of link  it must return the handler of new paege beacuse your action change page
        clickLink("Form Authentication");

        return new LoginPage(driver);

    }

    public ShiftingContent clickshiftingContent(){
        // to open the page of link  it must return the handler of new paege beacuse your action change page

        clickLink("Shifting Content");
        return new ShiftingContent(driver);

    }
    public DropDown clickDropdown(){
        clickLink("Dropdown");
        return new DropDown(driver);
    }

    public ForgotPassword retiveEmail(){

        clickLink("Forgot Password");
        return new ForgotPassword (driver);
    }

    public Hovers clickHovers(){
        clickLink("Hovers");
        return new Hovers(driver);
    }
    public KeyPress clickOnKeyPress(){
        clickLink("Key Presses");
        return new KeyPress(driver);
    }
    public HorizontalSlider clickonHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    public JavaScriptAlerts clickponAlert(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlerts(driver);
    }
    public FileUpload clickonFile(){
        clickLink("File Upload");
        return new FileUpload(driver);
    }
    public  ContextMenu clickonContext(){
        clickLink("Context Menu");
        return  new ContextMenu(driver);
    }
    public WYSIWYGEditor clickOnWysiwy(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditor(driver);
    }
    public Frames clickOnframe(){
        clickLink("Frames");
        return new Frames(driver);
    }
    public DynamicLoading cliconDynamic(){
        clickLink("Dynamic Loading");
        return new DynamicLoading(driver);
    }
    public LargeDeepDOM clickonLargeDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeDeepDOM(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public Dropdown clickonDropdown(){
        clickLink("Dropdown");
        return new Dropdown(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
public BrokenImages ClickOnBroken(){
        clickLink("Broken Images");
        return new BrokenImages(driver);
}

    private void clickLink(String lintText){
        driver.findElement(By.linkText(lintText)).click();
    }

}


