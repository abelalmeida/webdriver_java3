package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputFeild = By.id("target");
    private By resultFeild = By.id("result");
    public KeyPressesPage(WebDriver driver){
       this.driver = driver;
    }

public void enterText(String text){
       driver.findElement(inputFeild).sendKeys(text);
}

public String getResult(){

        return driver.findElement(resultFeild).getText();
}

public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p") + "=3.14");
}


}
