package calismalarim.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
/*
Amazon sayfasına gidin
Search bölümünü locate edip, "Tablet" aratalım
Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
Sayfayı kapatın
*/
public class C03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
//         Browser'ı açıp maximize yapın
        driver.manage().window().maximize();
        //     Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;

//Amazon sayfasına gidin

        driver.get("http://www.amazon.com");
//Search bölümünü locate edip, "Tablet" aratalım
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("tablet"+ Keys.ENTER);
//Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
        WebElement sonuc = driver.findElement(By.className("sg-col-inner"));
        System.out.println("sonuc"+sonuc.getText());
//Sayfayı kapatın
driver.close();
    }
}
