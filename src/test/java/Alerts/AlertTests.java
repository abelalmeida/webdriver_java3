package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
     var alertPage =   homePage.clickAlertPage();
     alertPage.triggerAlert();
     alertPage.alert_clickToAccept();
     assertEquals(alertPage.getResult(),"You successfuly clicked an alert","Result wrong");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickAlertPage();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToAccept();
        assertEquals(text,"I am a JS Confirm", "I am the wrong text");
    }

    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickAlertPage();
        alertPage.triggerPrompt();
        String text = "This is a test";
        alertPage.alert_setinput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You entered: " + text, "This is a test");
    }

}
