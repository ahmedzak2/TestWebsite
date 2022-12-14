package Basetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v106.emulation.Emulation;
import org.openqa.selenium.devtools.v85.log.Log;

import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Screen;
import utills.CookieManger;
import utills.WindowManger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static javax.swing.UIManager.put;


public class BaseTest {
   protected  HomePage homePage;

    //WebDriver driver;

    // to use devtools of chrome
   ChromeDriver driver;

    /*
    public void set2(){
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
driver.get("https://applitools.com/");
       // homePage = new HomePage(driver);
      //  System.out.println(driver.getTitle());

    }*/

    @BeforeMethod
    public void setUp(){

           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://the-internet.herokuapp.com/");
          homePage = new HomePage(driver);
        System.out.println(driver.getTitle());
       }

       public void startDevTools(){
           driver.get("https://the-internet.herokuapp.com/broken_images");
         // to make the devtools work this is to start devtools
           DevTools devTools= driver.getDevTools();

           // to create session
           devTools.createSession();
           // to enable logs
           devTools.send(Log.enable());
           // to print the logs to know what happen
           devTools.addListener(Log.entryAdded(), logEntry -> {
               // to spereate the entites
               System.out.println("---------");
               System.out.println("level "+logEntry.getLevel());
               System.out.println("level "+logEntry.getText());
               System.out.println("level "+logEntry.getUrl());

           });

           // to reload the page and check the console
           driver.get("https://the-internet.herokuapp.com/broken_images");
       }

      // to use the geoocation by commann
    public void TestLocationBySelenium(){
        DevTools devTools= driver.getDevTools();

        devTools.createSession();
        devTools.send(Emulation.setGeolocationOverride(Optional.of(52.5043),
                Optional.of(13.4501),
                Optional.of(1)));
        driver.get("https://my-location.org/");
        driver.quit();
    }
       public void testmockGeoLocation(){
        // to create map to put coordinates
           Map coordinates = new HashMap();

           {{
               put("latitude",30.073449049299477);
               put ("longitude", 31.346835782389807);
               put("accuracy",1);

           }};
           driver.get("https://where-am-i.org/");

        // you need to test string code man  and map of location
        driver.executeCdpCommand(
                "Emulation.setGeolocationOverride",coordinates);
//driver.get("https://where-am-i.org/");
       }
public void enablesSlowRexJonesII(){
    DevTools devTools= driver.getDevTools();
devTools.createSession();
// to start enable the network  we can send empty value
    devTools.send(Network.enable(
            Optional.empty(),
            Optional.empty(),
            Optional.empty()));
devTools.send(Network.emulateNetworkConditions(
        false,
        200,
        300,
        2000,
        // to select the type of network
        Optional.of(ConnectionType.CELLULAR3G)));
    driver.get("https://dev-hamza-admin.thewebops.com/login");

    System.out.println("enable slow network +"+driver.getTitle());
}
    public void doNotEnableRexJonesII(){
        driver.get("http://dev-hamza-admin.thewebops.com/");
        System.out.println("Do Not Enable Network: " + driver.getTitle());
    }
    @Test
    /*
    public void takeFullpageScreenshot() throws IOException {

      File source=  ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
        Files.move(source, new File("/home/zik/pratice/untitled4/.idea/"+source.getName()+".png"));
    }*/


    public WindowManger getWindowManger() {
        return new WindowManger(driver);
    }

    @BeforeMethod
/*
    public void gohome() {
        driver.get("https://the-internet.herokuapp.com/");

    }
*/


    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        // to run test without open the browser

        //options.setHeadless(true);
        return options;
    }

    // to make the website store cookies
    public CookieManger getCookieManager(){
        return new CookieManger(driver);
    }

/*

    @Test
    public void testRelativeLocator(){
        WebElement loginPanel = driver.findElement(By.linkText("Broken Images"));
        WebElement credentials = driver.findElement(with(
                By.linkText("Basic Auth"))
                .above(loginPanel));
        System.out.println(credentials.getText());
        System.out.println();
    }
    */
    /*
    @Test
    public void testListOfElements() {
        List<WebElement> allSocialMedia = driver.findElements(with(
                By.linkText("WYSIWYG Editor"))
                .near(By.id("footer")));

        for (WebElement socialMedia : allSocialMedia) {
            System.out.println(socialMedia.getAttribute("alt"));
        }
    }

    @Test
    public void testNewWindow(){
// to open new tab and use it
        WebDriver newWindow=  driver.switchTo().newWindow(WindowType.WINDOW);
        newWindow.get("https://tv.cimaa4u.fun/Episode/51961-%D9%85%D8%B4%D8%A7%D9%87%D8%AF%D8%A9+%D9%85%D8%B3%D9%84%D8%B3%D9%84+S.W.A.T+%D9%85%D9%88%D8%B3%D9%85+6-268265.html");
        System.out.println(driver.getTitle());
        WebDriver newWindow2 = driver.switchTo().newWindow(WindowType.TAB);
        newWindow2.get("https://tv.cimaa4u.fun/Episode/51961-%D9%85%D8%B4%D8%A7%D9%87%D8%AF%D8%A9+%D9%85%D8%B3%D9%84%D8%B3%D9%84+S.W.A.T+%D9%85%D9%88%D8%B3%D9%85+6-268265.html");
        System.out.println(driver.getTitle());
    }
    @Test
    public void testWorkingInBothWindowTab(){
        //automaticall open & swtich to new window
        driver.manage().window().minimize();
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.mreader.co/portal/api/login/");
        System.out.println( driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[1]/input")).sendKeys("Ahmed94");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/input")).sendKeys("M_3d@Dd5qbtXA!6");
        // driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[3]/button")).click();
        System.out.println(  driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[1]/input")).getText());
        Set<String> allWindowTabss= driver.getWindowHandles();
        //to return  iterator for collection of windows
        Iterator<String> iterate = allWindowTabss.iterator();

        String mainFirstWindow = iterate.next();

        // work in new window or tab

        // get window handler
        driver.switchTo().window(mainFirstWindow);
        // return to the main page


    }

 */



/*
public void getPositionDimension() {
    WebElement logoTAU = driver.findElement(
            By.xpath("//div[@id='app']//header/a/img"));
    Rectangle rectTAULogo = logoTAU.getRect();
    System.out.println("x: " + rectTAULogo.getX());
    System.out.println("y: " + rectTAULogo.getY());
    System.out.println("Width: " + rectTAULogo.getWidth());
    System.out.println("Height: " + rectTAULogo.getHeight());
}
 */

public Screen changeScreen(String link ){
    WebDriver newWindow=  driver.switchTo().newWindow(WindowType.TAB);
    newWindow.get(link);
    System.out.println(driver.getTitle());
    return new Screen(driver);
}
    @AfterMethod
    public void tearDown(){

    driver.quit();
    }
}


