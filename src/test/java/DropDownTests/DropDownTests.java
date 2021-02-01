package DropDownTests;

import Base.BaseTest;
import Pages.DropDownPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {
    @Test
    public void testSelectOption(){
       var dropDownPage = homePage.clickDropDown();
       String option1 = "Option 1";
       dropDownPage.selectFromDropDown(option1);
       var selectedOptions =dropDownPage.getSelectedOption();
       assertEquals(selectedOptions.size(), 1,"incorrect numbers of selections");
       assertTrue(selectedOptions.contains(option1),"option not selected");
    }
}
