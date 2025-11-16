package pages;
import com.microsoft.playwright.Page;

public class LogInPage {

    private final Page page;
    private final String url = "https://www.saucedemo.com/";


    public LogInPage(Page page) {
        this.page = page;
    }
// Go to the swagLabs website
    public void goToWebPage() {
        page.navigate(url);
    }
//Login
    public void login(String username, String password) {
        page.fill("#user-name", username);
        page.fill("#password", password);
        page.waitForTimeout(1000);
        page.click("#login-button");
        page.waitForSelector(".inventory_list");
    }
}


