package dropDown;

import Basetest.BaseTest;
import org.testng.annotations.Test;
import pages.DropDown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest  extends BaseTest {
    @Test
    public void testSelectOption(){
        DropDown dropDown = homePage.clickDropdown();
        String option="Option 1";
        dropDown.selectFormDropdown(option);
        var selectedoption = dropDown.getSelectoption();
        System.out.println(dropDown.getSelectoption());
        assertEquals(selectedoption.size(),1,"you choose the wron choise  ");
        assertTrue(selectedoption.contains(option), "Option not selected");
        }

}
