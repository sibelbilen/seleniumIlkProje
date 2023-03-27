package calismalarim.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Testcase01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://facebook.com");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sibel33@gmail.com"+ Keys.ENTER);
        WebElement sifre = driver.findElement(By.id("passContainer"));
        sifre.sendKeys("sibelcn");
WebElement button= driver.findElement(By.id("loginbutton"));
button.click();
WebElement yanlisifre= driver.findElement(By.className("_9ay7"));
yanlisifre.click();
    }
}
