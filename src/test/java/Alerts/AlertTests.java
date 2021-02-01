package Alerts;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {
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


}
