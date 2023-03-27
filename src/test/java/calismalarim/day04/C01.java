package calismalarim.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01 {
    public static void main(String[] args) {
        /*
        1) Tarayıcıyı açın
2) “http://practice.automationtesting.in/” URL'sini girin
3) Mağaza Menüsüne tıklayın
4) Şimdi Ana menü düğmesine tıklayın
5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
6) Ana sayfa yalnızca üç kaydırıcı içermelidir
         */

        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.get("http://practice.automationtesting.in");
        WebElement magaza = driver.findElement(By.id("menu-item-40"));
        WebElement webElement =driver.findElement(By.id("id=pagewrap"));
        WebElement magaza1 = driver.findElement(By.id("menu-icon"));


        magaza.click();
        magaza1.click();
webElement.click();

    }

}
