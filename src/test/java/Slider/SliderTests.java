package Slider;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTest {
    @Test
    public void testSliderToWholeNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizonalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getValue(),value,"Value for the slider is not equal");
    }
}
