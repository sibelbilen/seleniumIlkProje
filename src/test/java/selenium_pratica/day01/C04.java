package selenium_pratica.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    // https://www.amazon.com/ adresine gidin
    // Kaynak Kodlarini konsola yazdiriniz
    // Kaynak Kodlarinda "Gateway" yazdigini test edin
    // sayfayi kapatiniz
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

driver.manage().window().maximize();
        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        // Kaynak Kodlarini konsola yazdiriniz

      String sayfaKaynakKodlari=driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
      if (sayfaKaynakKodlari.contains("Gateway")){
          System.out.println(" sayfa kaynak kodlari Gateway iceriyor");
      }else
          System.out.println("sayfa kaynak kodlari Gateway icermiyor");


        // sayfayi kapatiniz
        driver.close();
    }

}
