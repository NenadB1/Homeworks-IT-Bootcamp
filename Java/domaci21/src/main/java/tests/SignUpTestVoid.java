package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTestVoid extends BaseTest{
    @Test
    public void verifyURL() {
        getLandingPage().openVoid();
        getLandingPage().clickSignUpButtonVoid();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }
    @Test
    public void verifyEmailPass() {
        getLandingPage().openVoid();
        getLandingPage().clickSignUpButtonVoid();
        Assert.assertEquals(getSignUpPage().getEmail().getAttribute("type"),"email");
        Assert.assertEquals(getSignUpPage().getPassword().getAttribute("type"),"password");
    }
    @Test
    public void checkInavlidPassword() {
        getLandingPage().openVoid();
        getLandingPage().clickSignUpButtonVoid();
        getSignUpPage().enterPassword("1234");
        assertVisibilityOfElement(getSignUpPage().getInvalidPasswordMess());
    }
    @Test
    public void checkInvalidConfirmPassword() {
        getLandingPage().openVoid();
        getLandingPage().clickSignUpButtonVoid();
        getSignUpPage().enterConfirmPassword("1234");
        assertVisibilityOfElement(getSignUpPage().getInvalidPasswordMess());
    }
    @Test
    public void checkInvalidEmail() {
        getLandingPage().openVoid();
        getLandingPage().clickSignUpButtonVoid();
        getSignUpPage().enterEmailVoid("nenad@co");
        assertVisibilityOfElement(getSignUpPage().getInvalidEmailMessage());
    }
    @Test
    public void checkDifferentPassword() {
        getLandingPage().open();
        getLandingPage().openVoid();
        getLandingPage().clickSignUpButtonVoid();
        getSignUpPage().enterPasswordVoid("12341");
        getSignUpPage().enterConfirmPassword("12331");
        assertVisibilityOfElement(getSignUpPage().getPasswordDontMatch());
    }
    @Test
    public void checkNameRequiered() {
        getLandingPage().openVoid();
        getLandingPage().clickSignUpButtonVoid();
        getSignUpPage().enterEmailVoid("nenad@google.com");
        getSignUpPage().enterPasswordVoid("12345");
        getSignUpPage().enterConfirmPasswordVoid("12345");
        getSignUpPage().clickSignUpButtonVoid();
        assertVisibilityOfElement(getSignUpPage().getNameFieldRequieredMess());
    }
}
