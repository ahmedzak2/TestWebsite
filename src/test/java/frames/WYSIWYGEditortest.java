package frames;

import Basetest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WYSIWYGEditortest extends BaseTest {
    @Test
    public void testEditor(){
        var editor = homePage.clickOnWysiwy();
        editor.clearBody();
    editor.enterText("hello");
        assertTrue(editor.getTextFromEditor().contains("hello"),"there wrong message ");

        editor.decreaseIndention();
    }
}
