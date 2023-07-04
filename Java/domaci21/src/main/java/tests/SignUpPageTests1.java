package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpPageTests1 extends BaseTest{

    @Test
    public void verifyURL() {
        getLandingPage1().open()
                .clickSignUpButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }
    @Test
    public void verifyEmailPass() {
        getLandingPage1().open()
                .clickSignUpButton();
        Assert.assertEquals(getSignUpPage1().getEmailField().getAttribute("type"),"email");
        Assert.assertEquals(getSignUpPage1().getPassword().getAttribute("type"),"password");
    }
    @Test
    public void checkInavlidPassword() {
        getLandingPage1().open()
                .clickSignUpButton();
        getSignUpPage1().enterPassword("1234");
        assertVisibilityOfElement(getSignUpPage1().getInvalidPasswordMess());
    }
    @Test
    public void checkInvalidConfirmPassword() {
        getLandingPage1().open()
                .clickSignUpButton();
        getSignUpPage1().enterConfirmPassword("1234");
        assertVisibilityOfElement(getSignUpPage1().getInvalidPasswordMess());
    }
    @Test
    public void checkInvalidEmail() {
        getLandingPage1().open()
                .clickSignUpButton();
        getSignUpPage1().enterEmail("nenad@co");
        assertVisibilityOfElement(getSignUpPage1().getInvalidEmailMessage());
    }
    @Test
    public void checkDifferentPassword() {
        getLandingPage1().open()
                .clickSignUpButton();
        getSignUpPage1().enterPassword("12341")
                .enterConfirmPassword("12332");
        assertVisibilityOfElement(getSignUpPage1().getPasswordDontMatch());
    }
    @Test
    public void checkNameRequiered() {
        getLandingPage1().open()
                .clickSignUpButton();
        getSignUpPage1().enterEmail("nenad@google.com")
                .enterPassword("12345")
                .enterConfirmPassword("12345")
                .clickSignUpButton();
        assertVisibilityOfElement(getSignUpPage1().getNameFieldRequieredMess());
    }
}
