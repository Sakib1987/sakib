import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css ="[class=\"a-color-base headline truncate-1line gwm-u-blackjack-typography\"]")
    WebElement deals;

@FindBy(xpath ="//a[@data-csa-c-content-id=\"nav_cs_amazonbasics\"]")
WebElement amazonBasics;

@FindBy(xpath ="//a[@data-csa-c-slot-id=\"nav_cs_4\"]")
        WebElement bestseller;

String dealsText(){

    return bestseller.getText();
}


     void  clickAmazonBasics(){

    amazonBasics.click();
     }






}

