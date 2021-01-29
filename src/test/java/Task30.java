import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task30 {
    @Test
    public void login() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tut.by/");
        driver.findElement(By.cssSelector("#authorize > div > a")).click();

        WebElement username = driver.findElement(By.name("login"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.cssSelector("#authorize > div > div > div > div.b-auth-form__inner > form > div:nth-child(3)"));

        username.sendKeys("seleniumtests@tut.by");
        password.sendKeys("123456789zxcvbn");
        login.click();

        String result = driver.findElement(By.cssSelector("#authorize > div.b-auth-i > a > span.uname")).getText();
        String expectedname = "Selenium Test";
        Assert.assertEquals(expectedname, result);

        driver.quit();

    }

}


