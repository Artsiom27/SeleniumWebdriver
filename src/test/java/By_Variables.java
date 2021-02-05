import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class By_Variables {
    @Test
    public void location() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tut.by/");

        WebElement icon = driver.findElement(By.className("header-search"));
        WebElement icon2 = driver.findElement(By.cssSelector("#mainmenu > ul > li:nth-child(3) > a"));
        WebElement icon3 = driver.findElement(By.xpath("//*[@id=\"geo_news_block\"]/div/div[1]/form/div[1]/a"));
        WebElement icon4 = driver.findElement(By.id("animated_mainmenu"));
        WebElement icon5 = driver.findElement(By.tagName("a"));
        WebElement icon6 = driver.findElement(By.name("lsgetframe"));
        WebElement icon7 = driver.findElement(By.linkText("Каталог цен"));
        WebElement icon8 = driver.findElement(By.partialLinkText("Каталог"));

        driver.quit();
    }
}
