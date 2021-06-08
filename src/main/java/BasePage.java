import log.Log4j;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    private Logger logger = Logger.getLogger(getClass());


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickById(String id){
        driver.findElement(By.id(id)).click();
    }

    public void clickByXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickByCssSelector(String cssSelector){ driver.findElement(By.cssSelector(cssSelector)).click();}

    public void sendById(String id,String value){
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public void getTextXpath(String xpath){
        driver.findElement(By.xpath(xpath)).getText();
    }

    public void randomSelectByXpath(String xpath){
        List<WebElement> page = driver.findElements(By.xpath(xpath));
        Random random = new Random();
        page.get(random.nextInt(page.size())).click();
    }

    public boolean findElementByXpath(String xpath){
        return driver.findElement(By.xpath(xpath)) != null;
    }

    public void assertEqualsXpath(String xpath){
        boolean location = driver.findElement(By.xpath(xpath)).isEnabled();
        if(location== true){
            Assert.assertEquals(location,true);
        }
        else{
            Assert.assertEquals(location,false);

        }
    }

    public void assertEqualsClickXpath(String xpath){
        boolean location = driver.findElement(By.xpath(xpath)).isDisplayed();
        if (location == true){
            Assert.assertEquals(location,true);
            clickByXpath(xpath);
        }else{
            System.out.println("Lokasyonu kontol et");
            Assert.assertEquals(location,false);
        }
    }

    public void assertEqualsClickId(String id){
        boolean location = driver.findElement(By.id(id)).isDisplayed();
        System.out.println(location);
        if (location == true){
            Assert.assertEquals(location,true);
            clickById(id);
        }
        else{
            System.out.println("Lokasyonu kontol et");
            Assert.assertEquals(location,false);
        }
    }

    public void assertEqualsClickCssSelector(String cssSelector){
        boolean location = driver.findElement(By.cssSelector(cssSelector)).isDisplayed();
        if (location == true){
            Assert.assertEquals(location,true);
            clickByCssSelector(cssSelector);
        }else{
            System.out.println("Lokasyonu kontol et");
            Assert.assertEquals(location,false);
        }
    }

    public void assertEqualsTextXpath(String value){
        Assert.assertTrue("Element sayfada bulunmadı",findElementByXpath("//*[text() = '"+value+"']"));
        System.out.println(value);
        Log4j.info(value);
    }

}
