package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HoziontalSliderPage {
    private WebDriver driver;
    private By sliderValue =By.id("range");
    private By slider = By.cssSelector(".sliderContainer input");

    public HoziontalSliderPage(WebDriver driver){
       this.driver = driver;
    }

    public void setSliderValue(String value){
        while(!getValue().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getValue(){
        return driver.findElement(sliderValue).getText();
    }
}
