package brokenImages;

import Basetest.BaseTest;
import org.testng.annotations.Test;

public class TestBroken extends BaseTest {
    @Test
    public void  TEstBrokenImage()  {
        var broken = homePage.ClickOnBroken();
startDevTools();

    }
@Test
    public void tecstLocation(){
        testmockGeoLocation();
}
@Test
    public void TestByseluimn(){
TestLocationBySelenium();
    }
    @Test
    public void testNetwork(){
        doNotEnableRexJonesII();
        enablesSlowRexJonesII();
    }
}
