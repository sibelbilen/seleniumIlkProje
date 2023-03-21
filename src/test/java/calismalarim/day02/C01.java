package calismalarim.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
//         Browser'ı açıp maximize yapın
        driver.manage().window().maximize();
        //     Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
        //         Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");

        //         Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //         Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin

      String actualUrl = driver.getCurrentUrl();
      String beklenenUrl="\"https://amazon.com\"";
      if (actualUrl.equals(beklenenUrl)){
          System.out.println("test passed");

      }else
          System.out.println("test not passed");
        //         Sayfanın konumunu ve boyutunu yazdırın
        driver.manage().window().getPosition();
        driver.manage().window().getSize();
        //         Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        driver.manage().window().setSize(new Dimension(40,20));
        driver.manage().window().setPosition(new Point(7,8));
      //  İstediğiniz şekilde olup olmadığını test edin
Point istenilensekildemi=driver.manage().window().getPosition();
        //Konum bilgilerini getPosition() methodu ile bir Point container'ı içerisine koyuyoruz.
        if (istenilensekildemi.getX()==7 && istenilensekildemi.getY()==8){
            System.out.println("istenilen sekilde");
        }else
            System.out.println("istenilen sekilde degil");
        Dimension istenilenSize=driver.manage().window().getSize();
        if (istenilenSize.getWidth()==20 && istenilenSize.getHeight()==40){
            System.out.println("istenilen size");

        }else
            System.out.println("istenilen size degil");
        driver.close();
    }
}
