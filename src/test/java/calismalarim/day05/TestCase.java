package calismalarim.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestCase {
    /*
    2. 'http://automationexercise.com' URL'sine gidin
3. Ana sayfanın başarıyla göründüğünü doğrulayın
4. 'Bize Ulaşın' düğmesine tıklayın
5. "İLETİŞİME GEÇİN" ifadesinin görünür olduğunu doğrulayın
6. Adı, e-postayı, konuyu ve mesajı girin
7. Dosya yükleyin
8. 'Gönder' düğmesini tıklayın
9. Tamam düğmesine tıklayın
10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' görünür
11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        Thread.sleep(2000);
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
      WebElement anaSayfa= driver.findElement(By.id("header"));
        System.out.println(anaSayfa.isDisplayed());
        //reklam cikarsa
        driver.findElement(By.id("dismiss-button")).click();;
        //4. 'Bize Ulaşın' düğmesine tıklayın
        WebElement bizeUlasinButton= driver.findElement(By.xpath("//a[@href=/contact_us]"));
        bizeUlasinButton.click();
    }
}
