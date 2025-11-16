package pages;

import com.microsoft.playwright.Page;

public class ProductPage {

    private final Page page;

    public ProductPage(Page page) {
        this.page = page;
    }
// Get the product name
    public String getProductName() {
        return page.locator(".inventory_item_name").first().innerText();
    }
// add product to the cart
    public void addProductToCart() {
        page.locator("button.btn_inventory").first().click();
        page.waitForTimeout(3000);
    }
// click the cart icon to go to cart page
    public void openCart() {
            page.click(".shopping_cart_link");
            page.waitForTimeout(2000);
        }

    }
