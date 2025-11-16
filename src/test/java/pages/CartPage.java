package pages;

import com.microsoft.playwright.Page;

public class CartPage {

    private final Page page;

    public CartPage(Page page) {
        this.page = page;
    }
// get the name of the cart to verify the name
    public String getProductNameInCart() {
        return page.locator(".inventory_item_name").innerText();

    }

}
