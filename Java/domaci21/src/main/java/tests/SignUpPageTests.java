package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTests extends BaseTest{
    @Test
    public void verifyURL() {
        getLandingPage().open()
                    .clickSignUpButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }
    @Test
    public void verifyEmailPass() {
        getLandingPage().open()
                .clickSignUpButton();
        Assert.assertEquals(getSignUpPage().getEmail().getAttribute("type"),"email");
        Assert.assertEquals(getSignUpPage().getPassword().getAttribute("type"),"password");
    }
    @Test
    public void checkInavlidPassword() {
        getLandingPage().open()
                .clickSignUpButton();
        getSignUpPage().enterPassword("1234");
        assertVisibilityOfElement(getSignUpPage().getInvalidPasswordMess());
    }
    @Test
    public void checkInvalidConfirmPassword() {
        getLandingPage().open()
                .clickSignUpButton();
        getSignUpPage().enterConfirmPassword("1234");
        assertVisibilityOfElement(getSignUpPage().getInvalidPasswordMess());
    }
    @Test
    public void checkInvalidEmail() {
        getLandingPage().open()
                .clickSignUpButton();
        getSignUpPage().enterEmail("nenad@co");
        assertVisibilityOfElement(getSignUpPage().getInvalidEmailMessage());
    }
    @Test
    public void checkDifferentPassword() {
        getLandingPage().open()
                .clickSignUpButton();
        getSignUpPage().enterPassword("12341")
                .enterConfirmPassword("12331");
        assertVisibilityOfElement(getSignUpPage().getPasswordDontMatch());
    }
    @Test
    public void checkNameRequiered() {
        getLandingPage().open()
                .clickSignUpButton();
        getSignUpPage().enterEmail("nenad@google.com")
                .enterPassword("12345")
                .enterConfirmPassword("12345")
                        .clickSignUpButton();
        assertVisibilityOfElement(getSignUpPage().getNameFieldRequieredMess());
    }
}
