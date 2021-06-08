import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String email="furkantest6@gmail.com";
    String password="test1234";
    String search = "Bilgisayar";

    String login="//a[@class='btnSignIn']";
    String inputEmailId ="email";
    String inputPasswordId ="password";
    String loginButtonId="loginButton";



    String inputSearchId = "searchData";
    String searchClickXpath = "//a[@class='searchBtn']";
    String pageScrollXpath="//a[text()='2']";
    String pageTwoXpath = "//a[@class='active ' and contains(text(),'2')]";
    String pageTwoClickXpath = "//h3[@class='productName bold']";




    public void Login() throws InterruptedException {
        assertEqualsClickXpath(login);
        Thread.sleep(2000);
        sendById(inputEmailId,email);
        Thread.sleep(2000);
        sendById(inputPasswordId,password);
        Thread.sleep(2000);
        assertEqualsClickId(loginButtonId);
    }

    public void homePageInLogged() throws InterruptedException {
        Thread.sleep(4000);
        sendById(inputSearchId,search);
        Thread.sleep(4000);
        assertEqualsClickXpath(searchClickXpath);
        Thread.sleep(2000);
        assertEqualsClickXpath(pageScrollXpath);
        Thread.sleep(4000);
        assertEqualsXpath(pageTwoXpath);
        Thread.sleep(4000);
        randomSelectByXpath(pageTwoClickXpath);
    }
}
