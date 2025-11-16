package testcases;

import org.junit.jupiter.api.Assertions;
import utilities.BrowserSetup;
import pages.*;
import org.junit.jupiter.api.Test;

public class SauceDemoTest extends BrowserSetup {
    @Test
    public void testScenario() {
        LogInPage login = new LogInPage(page);
        ProductPage product = new ProductPage(page);
        MenuOption menu = new MenuOption(page);
        CartPage cart = new CartPage(page);

// login with valid credentials
        login.goToWebPage();
        login.login("standard_user", "secret_sauce");

// add product to the cart
        String productName = product.getProductName();
        product.addProductToCart();

// go to cart page to verify the product name
        product.openCart();
        String cartProductName = cart.getProductNameInCart();
        Assertions.assertEquals(productName, cartProductName);

        //Logout
        menu.logout();
    }
}
