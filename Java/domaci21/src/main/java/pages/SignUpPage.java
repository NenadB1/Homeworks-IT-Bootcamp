package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signUpButton;
    private WebElement invalidPasswordMess;
    private WebElement invalidConfirmPasswordMess;
    private WebElement invalidEmailMessage;
    private WebElement passwordDontMatch;
    private WebElement nameFieldRequieredMess;
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getName() {
        nameField = getDriver().findElement(By.xpath("//input[@name='name']"));
        return nameField;
    }
    public WebElement getEmail() {
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }
    public WebElement getPassword() {
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }
    public WebElement getConfirmPassword() {
        confirmPasswordField = getDriver().findElement(By.id("confirmPassword"));
        return confirmPasswordField;
    }
    public WebElement getSignUpButton() {
        signUpButton = getDriver().findElement(By.xpath("//button[@type='submit']"));
        return signUpButton;
    }

    public WebElement getInvalidPasswordMess() {
        invalidPasswordMess = getDriver().findElement(By.xpath
                ("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        return invalidPasswordMess;
    }
    public WebElement getInvalidConfirmPassword() {
        invalidConfirmPasswordMess = getDriver().findElement
                (By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        return invalidConfirmPasswordMess;
    }

    public WebElement getInvalidEmailMessage() {
        invalidEmailMessage = getDriver().findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"));
        return invalidEmailMessage;
    }

    public WebElement getPasswordDontMatch() {
        passwordDontMatch = getDriver().findElement(By.xpath("//div[contains(text(), 'Passwords must match')]"));
        return passwordDontMatch;
    }

    public WebElement getNameFieldRequieredMess() {
        nameFieldRequieredMess = getDriver().findElement(By.xpath("//div[contains(text(), 'This field is required')]"));
        return nameFieldRequieredMess;
    }

    public SignUpPage enterName(String text) {
        getName().sendKeys(text);
        return this;
    }
    public SignUpPage enterEmail(String text) {
        getEmail().sendKeys(text);
        return this;
    }
    public SignUpPage enterPassword(String text) {
        getPassword().sendKeys(text);
        return this;
    }
    public SignUpPage enterConfirmPassword(String text) {
        getConfirmPassword().sendKeys(text);
        return this;
    }
    public SignUpPage clickSignUpButton() {
        getSignUpButton().click();
        return this;
    }
    public void enterNameVoid(String text) {
        getName().sendKeys(text);
    }
    public void enterEmailVoid(String text) {
        getEmail().sendKeys(text);
    }
    public void enterPasswordVoid(String text) {
        getPassword().sendKeys(text);
    }
    public void enterConfirmPasswordVoid(String text) {
        getConfirmPassword().sendKeys(text);
    }
    public void clickSignUpButtonVoid() {
        getSignUpButton().click();
    }
}
