package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://lnkd.in/dCzvU3Uj");
        //Add Element butonuna basin
        WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();
        Thread.sleep(2000);
        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("Delete Button Görünürmü ? "+deleteButton.isDisplayed());
        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));
        //Eğer xpath ile almak isterseniz //h3
        System.out.println("AddRemove Elements Görünürmü ? "+addRemoveElement.isDisplayed());
        //Sayfayı kapatını
        driver.close();


      //
       // CSS Selector'de xPath'ten farkli olarak INDEX KULLANAMIYORUZ.
             //   Ayrica xpath'teki gibi //, / ve @ koymaya gerek yok.

        /*
 Xpath ve cssSelector arasindaki farklar;
 1)Xpath metin ile calisabilir, cssSelector calisamaz.
 2)Xpath daha fazla kombinasyona sahiptir ve index'e gore arama yapabilir.
 3)cssSelector index'e gore arama yapamaz ancak daha hizli calisir.
 */
    }
    }

