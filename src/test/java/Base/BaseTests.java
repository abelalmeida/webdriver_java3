package Base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        String osName = System.getProperty("os.name");
        if(osName.equals("Mac")){
            System.setProperty("webdriver.chrome.driver", "resources/Mac/chromedriver");
        }else if(osName.equals("Linux")){
            System.setProperty("webdriver.chrome.driver", "resources/Linux/chromedriver88");
        }
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        // instanitate chrome driver
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
        /*WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();
        WebElement  menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();
        List <WebElement> list = driver.findElements(By.tagName("li"));
        System.out.println(list.size());*/
       //List<WebElement> tags = driver.findElements(By.tagName("a"));
       //System.out.println(tags.size());

        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(375, 812));
        //System.out.println(driver.getTitle());
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
