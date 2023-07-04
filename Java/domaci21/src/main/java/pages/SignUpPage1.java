package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage1 extends BasePage{
    @FindBy(name = "name")
    private WebElement nameField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "confirmPassword")
    private WebElement confirmPasswordField;
    @FindBy(xpath ="//button[@type='submit']")
    private WebElement signUpButton;
    @FindBy(xpath ="//div[contains(text(), 'This field must have no less than 5 characters')]" )
    private WebElement invalidPasswordMess;
    @FindBy(xpath ="//div[contains(text(), 'This field must have no less than 5 characters')]" )
    private WebElement invalidConfirmPasswordMess;
    @FindBy(xpath ="//div[contains(text(), 'Valid email is required')]" )
    private WebElement invalidEmailMessage;
    @FindBy(xpath ="//div[contains(text(), 'Passwords must match')]" )
    private WebElement passwordDontMatch;
    @FindBy(xpath ="//div[contains(text(), 'This field is required')]" )
    private WebElement nameFieldRequieredMess;
    public SignUpPage1(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(),this);
    }
    public WebElement getName() {
        return nameField;
    }
    public WebElement getEmailField() {
        return emailField;
    }
    public WebElement getPassword() {
        return passwordField;
    }
    public WebElement getConfirmPassword() {
        return confirmPasswordField;
    }
    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public WebElement getInvalidPasswordMess() {
        return invalidPasswordMess;
    }
    public WebElement getInvalidConfirmPassword() {
        return invalidConfirmPasswordMess;
    }

    public WebElement getInvalidEmailMessage() {
        return invalidEmailMessage;
    }

    public WebElement getPasswordDontMatch() {
        return passwordDontMatch;
    }

    public WebElement getNameFieldRequieredMess() {
        return nameFieldRequieredMess;
    }
    public SignUpPage1 enterName(String text) {
        nameField.sendKeys(text);
        return this;
    }
    public SignUpPage1 enterEmail(String text) {
        emailField.sendKeys(text);
        return this;
    }
    public SignUpPage1 enterPassword(String text) {
        passwordField.sendKeys(text);
        return this;
    }
    public SignUpPage1 enterConfirmPassword(String text) {
        confirmPasswordField.sendKeys(text);
        return this;
    }
    public SignUpPage1 clickSignUpButton() {
        signUpButton.click();
        return this;
    }
}
