package calismalarim.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class c03 {
    public static void main(String[] args) {
        //gitmek istediginiz webdriverin yerini belirtiniz
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        //bos bir browser aciniz
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
//gitmek istediginiz sayfayi belirtiniz?
      driver.get("http://www.trendyol.com");
      //browserin sayfa basligini getiriniz
        System.out.println("sayfa basligi:"+driver.getTitle());
//sayfa adresinin getiriniz
        System.out.println("sayfa adresi"+driver.getCurrentUrl());
//sayfa kaynak kodlarini getiriin
        System.out.println("kaynak kod"+driver.getPageSource());
        //sayfa hash kodunu getirir.//sayfalara arasi gecisis saglar
        System.out.println("sayfahasd kodunu getirir"+driver.getWindowHandles());
    }
}
