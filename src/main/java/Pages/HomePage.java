package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
    this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoverPage clickOnHovers(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HoziontalSliderPage clickHorizonalSlider(){
        clickLink("Horizontal Slider");
        return new HoziontalSliderPage(driver);
    }

    public AlertsPage clickAlertPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage contextMenuItem(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    private void clickLink(String linktext){
     driver.findElement(By.linkText(linktext)).click();
    }
}
