import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {

        Faker faker = new Faker();

        System.setProperty("webdriver.chrome.driver", "C://Users//Nenad//Desktop//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));

        WebElement email = driver.findElement(By.id("userEmail"));

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        driver.manage().window().maximize();

        fullName.sendKeys(faker.name().fullName());

        email.sendKeys(faker.internet().emailAddress());

        currentAddress.sendKeys(faker.address().fullAddress());

        permanentAddress.sendKeys(faker.address().fullAddress());

        WebElement submit = driver.findElement(By.id("submit"));

        submit.click();

        WebElement nameBox = driver.findElement(By.id("name"));

        WebElement emailBox = driver.findElement(By.id("email"));


        if(nameBox.getText().contains(fullName.getText()) && emailBox.getText().contains(email.getText())){
            System.out.println("Name and email address match!");
        } else {
            System.out.println("Name and email address do not match");
        }

        driver.close();
    }
}
