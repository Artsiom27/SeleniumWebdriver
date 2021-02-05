import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task30 {
    WebDriver driver;

    @Before
    public void aaa() {
        driver = new ChromeDriver();
    }

    @Test
    public void login() {

        driver.get("https://www.tut.by/");
        driver.findElement(By.cssSelector("#authorize > div > a")).click();

        WebElement usernameInput = driver.findElement(By.name("login"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@tabindex=6]"));

        usernameInput.sendKeys("seleniumtests@tut.by");
        passwordInput.sendKeys("123456789zxcvbn");
        loginButton.click();

        String result = driver.findElement(By.cssSelector("span.uname")).getText();
        String expectedname = "Selenium Test";
        Assert.assertEquals(expectedname, result);

    }

    @After
    public void close() {
        driver.quit();

    }
}



