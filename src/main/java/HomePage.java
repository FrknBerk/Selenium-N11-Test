import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    String popUpXpath ="(//span[@class='seg-popup-close'])[2]";
    String page = "n11.com - Hayat Sana Gelir";
    String onSlideXpath = "//div[@class='dn-slide-buttons horizontal']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void home() throws InterruptedException {
        Thread.sleep(20000);
        //pop up kapatma
        assertEqualsClickXpath(popUpXpath);
        Thread.sleep(4000);
        assertEqualsTextXpath(page);
        Thread.sleep(4000);

        //Ekranda gelen on slide kapatıyorum
        assertEqualsClickXpath(onSlideXpath);
        Thread.sleep(2000);

    }

}
