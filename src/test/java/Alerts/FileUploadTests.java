package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();

        uploadPage.uploadFile("/home/aalmeida/Training/webdriver_java3/resources/Linux/chromedriver88");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver88", "Uploaded files incorrect");
    }
}
