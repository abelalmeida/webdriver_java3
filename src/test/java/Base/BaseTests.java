package Base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTests {
    private EventFiringWebDriver efDriver;
    private WebDriver driver;
    protected HomePage homePage;
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeClass
    public void setUp(){
        //setup Driver
        setupDriver();
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
