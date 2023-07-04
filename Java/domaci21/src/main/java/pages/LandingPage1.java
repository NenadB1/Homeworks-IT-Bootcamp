package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage1 extends BasePage{
    private By signUpButton= By.cssSelector("#app > div > div > header > div > div.v-toolbar__items > a:nth-child(4)");
    public LandingPage1(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public LandingPage1 open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com");
        return this;
    }
    public LandingPage1 clickSignUpButton() {
        getDriver().findElement(signUpButton).click();
        return this;
    }
}
