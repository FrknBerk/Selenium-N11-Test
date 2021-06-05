import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class N11Test extends Base {

    @Test
    public void N11Test() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.home();


        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login();
        Thread.sleep(8000);

        //Login olduktan sonra bilgisayar kelimesini aratıp 2 sayfaya gidiyoruz
        loginPage.homePageInLogged();


        CartPage cartPage = new CartPage(driver);
        Thread.sleep(2000);

        //Sepete Ekleme
        cartPage.cart();
        Thread.sleep(2000);

        //Sepete Gitme
        cartPage.goToCart();
        Thread.sleep(2000);

        //Popup şekliden gelen aydınlatma metnini kapatma
        cartPage.aydınlatmaMetniClick();

        Thread.sleep(2000);

        //Ürün fiyatını karşılaştırıyoruz
        cartPage.checkCartPriceProduct();

        //Ürün adedini arttırıyoruz
        cartPage.productPieceUpClick();
        Thread.sleep(2000);

        //Ürün adedini kontrol ediyoruz
        cartPage.checkCartPieceText();
        Thread.sleep(2000);

        //Sepetteki ürünü siliyoruz
       cartPage.productCartDelete();
        Thread.sleep(2000);

        //Sepetin boş olup olmadığını kontrol ediyoruz
        cartPage.checkCartEmpty();

    }
}
