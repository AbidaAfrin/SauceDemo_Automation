package pages;

import com.microsoft.playwright.Page;
public class MenuOption {



        private final Page page;

        public MenuOption(Page page) {
            this.page = page;
        }

//        public void openCart() {
//            page.click(".shopping_cart_link");
//            page.waitForTimeout(1000);
//        }

        public void logout() {
            page.click("#react-burger-menu-btn");
            page.waitForSelector("#logout_sidebar_link");
            page.click("#logout_sidebar_link");
            page.waitForTimeout(1000);
        }
}
