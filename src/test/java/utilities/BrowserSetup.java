package utilities;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserSetup {

    protected String url = "https://www.saucedemo.com/";
    Playwright playwright;
    BrowserType browserType;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeEach
    public void startChromeBrowser() {
        this.playwright = Playwright.create();
        this.browserType = this.playwright.chromium();
        this.browser = this.browserType.launch((new BrowserType.LaunchOptions()).setHeadless(false));
        this.context = this.browser.newContext(new Browser.NewContextOptions());
        this.page = this.browser.newPage();
        page.waitForTimeout(1000);

    }



    @AfterEach
    public void tearDown() {
        context.close();
        browser.close();
        playwright.close();
    }

}
