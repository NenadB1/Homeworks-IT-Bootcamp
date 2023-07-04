package domaci20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Zadatak1 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Nenad//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeEachMethod() {
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();
        WebElement sigUpSpan = driver.findElement(By.cssSelector("#app > div > div > header > div > div.v-toolbar__items > a:nth-child(4)"));
        sigUpSpan.click();
    }

    @Test
    public void verifyURL ()  {
         String signUp = "/signup";
        Assert.assertTrue(driver.getCurrentUrl().contains(signUp));
    }

    @Test
    public void verifyEmailPass() throws InterruptedException {
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("email"));
        String emailText = "email";
        WebElement password = driver.findElement(By.id("password"));
        String passwordText = "password";
        Assert.assertEquals(email.getAttribute("type"),emailText);
        Assert.assertEquals(password.getAttribute("type"),passwordText);
    }

    @Test
    public void checkInvalidPass() throws InterruptedException {
       Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("1234");
        WebElement invalidPassword = driver.findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        Assert.assertTrue(invalidPassword.isDisplayed());
    }

    @Test
    public void checkInvalidConfPass() throws InterruptedException {
       Thread.sleep(2000);
        WebElement confPassword = driver.findElement(By.id("confirmPassword"));
        confPassword.sendKeys("1234");
        WebElement invalidConfPassword = driver.findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        Assert.assertTrue(invalidConfPassword.isDisplayed());
    }

    @Test
    public void checkInvalidEmail() throws InterruptedException {
       Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("nenad@co");
        Thread.sleep(2000);
        WebElement invalidMEmail = driver.findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"));
        Assert.assertTrue(invalidMEmail.isDisplayed());
    }

    @Test
    public void checkDifferentPass() throws InterruptedException {
      Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        WebElement confPassword = driver.findElement(By.id("confirmPassword"));
        password.sendKeys("12345");
        confPassword.sendKeys("12344");
        WebElement passwordsNotMatch = driver.findElement(By.xpath("//div[contains(text(), 'Passwords must match')]"));
        Assert.assertTrue(passwordsNotMatch.isDisplayed());
    }
    @Test
    public void checkNameReq() throws InterruptedException {
       Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement confPassword = driver.findElement(By.id("confirmPassword"));
        email.sendKeys("nenad@google.com");
        password.sendKeys("12345");
        confPassword.sendKeys("12345");
        WebElement signUpBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        signUpBtn.click();
        Thread.sleep(2000);
        WebElement nameRequired = driver.findElement(By.xpath("//div[contains(text(), 'This field is required')]"));
        Assert.assertTrue(nameRequired.isDisplayed());
    }

    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
