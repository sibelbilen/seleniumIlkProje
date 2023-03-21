package selenium_pratica.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {

    // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
    // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
    // sayfayi kapatiniz
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        System.out.println("maximaze seklinde konum:"+driver.manage().window().getPosition());
        System.out.println("maximize seklinde boyut:"+driver.manage().window().getSize());

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();

        System.out.println("fullsren seklinde maximize:"+driver.manage().window().getPosition());
        System.out.println("fullscreen seklinde maximize:"+driver.manage().window().getSize());

        // sayfayi kapatiniz
driver.close();
    }
}
