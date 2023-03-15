import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.PageFactory.*;

public class Hometest extends Setup {


    HomePage home;
    @BeforeMethod

    void setUpTest(){
        setupDriver("https://amazon.com");
       home = PageFactory.initElements(driver,HomePage.class);

    }

    @Test
    void testDeals(){
      String actualText = home.dealsText();
        System.out.println(actualText );
      Assert.assertEquals(actualText,"Top Deal");

    }

    @Test
    void testBasics(){
        home.clickAmazonBasics();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.amazon.com/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasichttps://www.amazon.com/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics");
    }

  @Test
       void bestseller(){
            String actualText = home.dealsText();
            System.out.println(actualText);

            Assert.assertEquals(actualText,"Best Sellers");
        }



}
