package Screen;

import Basetest.BaseTest;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class testSCren extends BaseTest {

   @Test

   // take screenshot form anthor website
    public void takeWEbElementScreenSHot() throws IOException {
      // WebElement nextGeneration ="";
      var screen=   changeScreen("https://applitools.com/");
      // to capture screenshoot and save it in specific location
     var image=  screen.takeScreen();

      File source =  image.getScreenshotAs(OutputType.FILE);

       //File location = new File("/home/zik/pratice/untitled4/.idea/"+"screen.png");
      // Files.move(source.toPath(), location.toPath());
       Files.move(source, new File("/home/zik/pratice/untitled4/.idea/"+image.getText()+".png"));
       startDevTools();
       //FileHandler.copy(source, location);


       //   FileHandler.copy(image,location);

       ;

}

}
