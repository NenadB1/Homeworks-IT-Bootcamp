package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LandingPage;
import pages.LandingPage1;
import pages.SignUpPage;
import pages.SignUpPage1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private LandingPage landingPage;
    private LandingPage1 landingPage1;
    private SignUpPage signUpPage;
    private SignUpPage1 signUpPage1;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Nenad//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        landingPage = new LandingPage(driver,wait);
        landingPage1 = new LandingPage1(driver,wait);
        signUpPage = new SignUpPage(driver,wait);
        signUpPage1 = new SignUpPage1(driver,wait);
    }
    @BeforeMethod
    public void waitBefore() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public WebDriver getDriver() {
        return  this.driver;
    }
    public LandingPage getLandingPage() {
        return this.landingPage;
    }
    public LandingPage1 getLandingPage1() {
        return this.landingPage1;
    }

    public SignUpPage getSignUpPage() {
        return this.signUpPage;
    }
    public SignUpPage1 getSignUpPage1() {
        return this.signUpPage1;
    }
    public WebDriverWait getWait() {
        return this.wait;
    }
    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }
    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
