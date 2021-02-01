package hover;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
@Test
public class HoverTests extends BaseTest {
   public void testHoverUser1(){
      var hoversPage = homePage.clickOnHovers();
      hoversPage.hoverOverFigure(1);
      var caption = hoversPage.hoverOverFigure(1);
      assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
      assertEquals(caption.getTitled(),"name: user1","caption title incorrect");
      assertEquals(caption.getLinkText(),"View profile", "Caption link wrong");
      assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
   }
}
