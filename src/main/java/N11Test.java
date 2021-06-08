import org.junit.Test;

public class N11Test extends Base {

    @Test
    public void N11Test() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.home();


        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login();

        //Login işlemi başarısız olduğu nedeni ile diğer isterleri yerine getirmek için n11 sayfasına yönlendirdim
        driver.get("https://www.n11.com/");


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
