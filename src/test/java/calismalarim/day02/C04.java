package calismalarim.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04 {
    /*

“city bike” araması yapın
Arama sonuç metnini yazdırın
Sonuç sayısını yazdırın
Sonuc sayısını LAMBDA ile yazdırın
Çıkan ilk sonucun resmine tıklayın.
Sayfayı kapatın
*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        https://www.amazon.com/ sayfasına gidin
        
        driver.get("https://www.amazon.com/");
//        "city bike" araması yapın
        
   WebElement seach=driver.findElement(By.id("twotabsearchtextbox"));
   
   seach.sendKeys("city bike"+Keys.ENTER);
   
   
      //  Arama sonuç metnini yazdırın
        
        
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));//Tüm  "sg-col-inner" class name'i içeren web elementleri bir list içerisine koyduk
        System.out.println("aramaSonucu = " + aramaSonucu.get(0).getText());//List içerisinden 1. elemanı alarak değerini yazdırıyorum

       // Sonuç sayısını yazdırın
        
        String sonucSAyisi=aramaSonucu.get(0).getText().split(" ")[2];
        System.out.println("sonucSAyisi = " + sonucSAyisi);
        //Sonuc sayısını LAMBDA ile yazdırın
        
        Arrays.stream(aramaSonucu.get(0).getText().split(" ")).skip(2).limit(1).forEach(System.out::println);


       List< WebElement> resim= driver.findElements(By.className("s-image"));
        resim.get(0).click();
driver.close();
    }
    }