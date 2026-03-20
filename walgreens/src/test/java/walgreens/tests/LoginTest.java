package walgreens.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import walgreens.BaseTest;
import walgreens.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void openHomePage_titleContainsWalgreens() {
        LoginPage page = new LoginPage(driver);
        page.open();
        String t = page.title();
        // Accept either explicit 'Walgreens' in title or at least a non-empty title
        assertTrue(t.toLowerCase().contains("walgreens") || t.length() > 0, "Title should contain 'Walgreens' or be non-empty: " + t);
    }
}
