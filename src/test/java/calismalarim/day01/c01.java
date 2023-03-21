package calismalarim.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class c01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


     //   facabook adrsine gidin
//        driver.get("http://www.facebook.com");
       // e posta kutusuna rastgele bir mail giriniz
//WebElement epostakutusu=driver.findElement(By.xpath("//input[@id='email']"));
//epostakutusu.sendKeys("sssss");
//
//sifreye rastgele sifre giirniz
// WebElement sifreKutusu=driver.findElement(By.xpath("//input[@id='pass']"));
//
//sifreKutusu.sendKeys("ssss3");
//giris yap butonuna basiniz?
//    driver.findElement(By.xpath("//button[@name='login']")).submit();
//burada hata verecek iste

//sorular2

//adrsie gidelim
driver.get("http://www.bestbuy.com");
//kac adet buon oldugunu bulunuz vee yazdiriniz
 List<WebElement>butonlistesi=driver.findElements(By.tagName("button"));
        System.out.println("buton sayisi:"+butonlistesi.size());

//her butonun uzerindeki yazilari yazdirin?
        for (WebElement w : butonlistesi) {
            System.out.println("uzerindeki sayilar>:"+w.getText());

        }
    }
}
