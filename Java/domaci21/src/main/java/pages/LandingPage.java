package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {
    private WebElement signUpButton;

    public LandingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getSignUpButton() {
       signUpButton = getDriver().findElement(By.cssSelector
               ("#app > div > div > header > div > div.v-toolbar__items > a:nth-child(4)"));
       return signUpButton;
    }
    public LandingPage clickSignUpButton() {
        getSignUpButton().click();
        return this;
    }
    public LandingPage open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com");
        return this;
    }
    public void clickSignUpButtonVoid() {
        getSignUpButton().click();
    }
    public void openVoid() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com");
    }
}
