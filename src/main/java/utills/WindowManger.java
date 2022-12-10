package utills;

import org.openqa.selenium.WebDriver;

public class WindowManger {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManger(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }
    public void  goBack(){
        navigation.back();

    }
    public void goFroaward(){
        navigation.forward();
    }
    public void refreshPage(){
        navigation.refresh();
    }
    public void goTo(String url){
        navigation.to(url);
    }
   public  void switchToTab(String tabTitle){
       var windows = driver.getWindowHandles();

       System.out.println("Number of tabs: " + windows.size());

       System.out.println("Window handles:");
       windows.forEach(System.out::println);

       for(String window : windows){
           System.out.println("Switching to window: " + window);
           driver.switchTo().window(window);

           System.out.println("Current window title: " + driver.getTitle());

           if(tabTitle.equals(driver.getTitle())){
               break;
           }
        }
    }
    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}