
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    String popUpXpath ="(//span[@class='seg-popup-close'])[2]";
    String page = "n11.com - Hayat Sana Gelir";
    String onSlideXpath = "//div[@class='dn-slide-buttons horizontal']";


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
