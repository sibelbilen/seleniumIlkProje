package day01_DriversLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");

        WebDriver driver = new EdgeDriver();//bos bir browser actik
    driver.get("https://www.google.com");//gitmek istedigimiz sayfayi belirtiriz.

        System.out.println("sayfa basligi :"+driver.getTitle());// driver.getTitle():sayfa basligini getirir.
        System.out.println("sayfa adresi(url)"+driver.getCurrentUrl());//driver.getCurrentUrl():sayfa adresini getirir.
       // System.out.println("kodlari"+driver.getPageSource());//driver.getPageSource(): sayfa kaynak kodlari ekrana getirir
        System.out.println("sayfanin(windows)hash degeri: "+driver.getWindowHandle());//driver.getWindowHandle():sayfanin(windows)hash degerini getirir
                                                                                                     // bu hash degerleri ile baska sayfadan bu sayfaya direkt donebilmeyi saglar.
                                                                                                    //(sayfalar arasi gecis)
    }
}
