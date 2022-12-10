package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {
public WebDriver driver;
private By inputField =By.id("file-upload");
private By uploadButton = By.id("file-submit");
private By result = By.className("example");
private By fileName = By.id("uploaded-files");


    public FileUpload(WebDriver driver) {
        this.driver = driver;
    }
public  void  clickUploadFile(){
        driver.findElement(uploadButton).click();
}
public void uploadFile(String path){
        driver.findElement(inputField).sendKeys(path);
        clickUploadFile();;
}
public String findFile(){
 return        driver.findElement(result).getText();
}

    public String findUploadFile(){
        return   driver.findElement(fileName).getText();
    }
}
