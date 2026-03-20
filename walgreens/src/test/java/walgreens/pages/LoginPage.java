package walgreens.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final String url = "https://www.walgreens.com";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public String title() {
        return driver.getTitle();
    }
}
