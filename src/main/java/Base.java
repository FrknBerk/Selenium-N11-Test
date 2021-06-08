import log.Log4j;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    public WebDriver driver;


    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        //Aşağıdaki kod ile test gerçekleştirdiğim sayfada chrome otomatik test yazılımı tarafından kontrol ediliyor kaldırdım
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver","C:\\Users\\FurkanBerk\\Selenium\\driver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.n11.com/");
        Log4j.startLog("N11 test");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        Log4j.endLog("Test sonlandı");
        driver.quit();
    }

}
