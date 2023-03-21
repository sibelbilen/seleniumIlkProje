package calismalarim.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        //odev

        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        //amazon sayfasina gidelim.
        driver.get("http://www.amazon.com");
        //sayfanin konumunu ve boyutunu yazdirin
        System.out.println("sayfanin konumu : "+driver.manage().window().getPosition());
        System.out.println("sayfanin boyutu: "+driver.manage().window().getSize());
        //Sayfayı minimize(simge durumu) yapalım

     driver.manage().window().minimize();
     //simge durumunu 3 saniye bekletip maximiza yapin
        Thread.sleep(3000);
     driver.manage().window().maximize();
       //sayfanin boyutunu ve konumunu maximaize sekilde yaziniz
        System.out.println("maximaze seklinde konum"+driver.manage().window().getPosition());
        System.out.println("maximize seklinde boyut"+driver.manage().window().getSize());

        //sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //sayfanin konumunu ve boyutunu fullscreen seklinde yaziniz
        System.out.println("fullsren seklinde"+driver.manage().window().getPosition());
        System.out.println("fullscreen seklinde "+driver.manage().window().getSize());

        //sayfayi kapat
        driver.close();

    }
}
