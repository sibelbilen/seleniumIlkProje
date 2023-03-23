package calismalarim.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
//         Browser'ı açıp maximize yapın
        driver.manage().window().maximize();
        //     Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
        /*
     Amazon sayfasına gidin
     Search kutusunu locate edin
     Search kutusunda iphone aratın
     Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın
     Sayfayı kapatınız
     */


   //  Amazon sayfasına gidin

        driver.get("https://www.amazon.com");



//         Search kutusunu locate edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

//         Arama kutusunda iphone aratın
        aramaKutusu.sendKeys("iphone"+ Keys.ENTER);


//     Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın
        List<WebElement>inputList=driver.findElements(By.tagName("input"));
        System.out.println(inputList.size());
List<WebElement>aList=driver.findElements(By.tagName("a"));
        System.out.println(aList.size());
//     Sayfayı kapatınız
driver.close();

    }
}
