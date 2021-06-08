import org.openqa.selenium.WebDriver;

public class CartPage extends  BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }


    String addCartXpath = "//a[@title='Sepete Ekle' and contains(text(),'Sepete Ekle')]";
    String goToCartXpath ="//a[@class='myBasket ']";
    String aydınlatmaMetniXpath = "//span[@class='closeBtn']";
    String productPriceXpath = "//div[@class='priceArea']";
    String cartTotalPriceXpath = "//div[@class='dtl total']/span[@class='price']";
    String productPieceUpXpath = "//span[@class='spinnerUp spinnerArrow']";
    String checkCartPiece = "Toplam 2 ürün";
    String productDeleteXpath ="//span[@class='removeProd svgIcon svgIcon_trash']";
    String cartEmpty = "Sepetiniz Boş";



    public void cart(){
        assertEqualsClickXpath(addCartXpath);
    }

    public void goToCart(){
        assertEqualsClickXpath(goToCartXpath);
    }

    public void aydınlatmaMetniClick(){
        assertEqualsClickXpath(aydınlatmaMetniXpath);
    }

    public void checkCartPriceProduct(){
        getTextXpath(productPriceXpath);
        getTextXpath(cartTotalPriceXpath);

    }

    public void  productPieceUpClick(){
        assertEqualsClickXpath(productPieceUpXpath);
    }

    public void  checkCartPieceText(){
        assertEqualsTextXpath(checkCartPiece);
    }

    public void productCartDelete(){
        assertEqualsClickXpath(productDeleteXpath);
    }

    public void checkCartEmpty(){
        assertEqualsTextXpath(cartEmpty);
    }
}
