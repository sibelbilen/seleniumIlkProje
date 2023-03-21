package selenium_pratica.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.Key;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        // ilk kutucuga 20 giriniz
        // ikinci kutucuga 30 giriniz
        // calculate'e tıklayınız
        // sonucu yazdırınız
        // sayfayi kapatiniz


        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));



        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();


        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");


        // ilk kutucuga 20 giriniz
WebElement ilkKutucuk=driver.findElement(By.id("number1"));
ilkKutucuk.sendKeys("20");
Thread.sleep(2000);


        // ikinci kutucuga 30 giriniz

        WebElement ikinciKutucuk=driver.findElement(By.id("number2"));
        ikinciKutucuk.sendKeys("30");

Thread.sleep(2000);


        // calculate'e tıklayınız


        WebElement calculate=  driver.findElement(By.id("calculate"));
       calculate.click();

        // sonucu yazdırınız
        WebElement sonuc=driver.findElement(By.id("answer"));
        System.out.println("toplama islmeinin sonucu :"+sonuc.getText());



        // sayfayi kapatiniz
       driver.close();
    }
}
