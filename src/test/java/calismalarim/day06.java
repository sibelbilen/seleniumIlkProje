package calismalarim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class day06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.hepsiburada.com");
driver.findElement(By.id("myAccount")).click();
        //giris dugmesine tiklayiniz

        driver.findElement(By.id("register")).click();;
   WebElement kayitOlma= driver.findElement(By.xpath("//input[@type='text']"));
    kayitOlma.sendKeys("sibelbilen33@gmail.com"+ Keys.ENTER);
  //    WebElement sifre =driver.findElement(By.id(""));
    }
}
