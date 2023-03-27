package calismalarim.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TekrarTesti {
    /*
    Tekrar Testi
1-C01_TekrarTesti isimli bir class olusturun
2- https://www.amazon.com/ adresine gidin
3- Browseri tam sayfa yapin
4.- Sayfayi “refresh” yapin
5. Sayfa basliginin “Spend less” ifadesi icerdigini test edin
6. Gift Cards sekmesine basin
7. Birthday butonuna basin
8. Best Seller bolumunden ilk urunu tiklayin
9. Gift card details’den 25 $’i secin
10-Urun ucretinin 25$ oldugunu test edin
10-Sayfayi kapatin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

       // 2- https://www.amazon.com/ adresine gidin


        driver.get("https://www.amazon.com");


      //  3- Browseri tam sayfa yapin

        driver.manage().window().maximize();

       // 4.- Sayfayi “refresh” yapin

        driver.navigate().refresh();

        //5. Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        if (driver.getTitle().contains("Spend less")){
            System.out.println("sayfa basliginda iceriyor");
        }else
            System.out.println("sayfa basliginda icermiyir");

        //6. Gift Cards sekmesine basin
WebElement giftCardsSekmesi= driver.findElement(By.xpath("//*[text()='Gift Cards']"));
giftCardsSekmesi.click();
//7. Birthday butonuna basin
        WebElement birthday=driver.findElement(By.xpath("//*[text()='Birthday']"));
        birthday.click();
        //8. Best Seller bolumunden ilk urunu tiklayin
     driver.findElement(By.xpath("//*[text()='Amazon.com eGift Card'][1]")).click();
//9. Gift card details’den 25 $’i secin
        WebElement details=driver.findElement(By.id("gc-mini-picker-amount-1"));
        details.click();
//10-Urun ucretinin 25$ oldugunu test edin
        if (details.equals("25$")){
            System.out.println("fiyat ayni");
        }else
            System.out.println("fiyat ayni degil");
     //   10-Sayfayi kapatin
        driver.close();
    }
}
