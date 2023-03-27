package day04_xpath_CssSelctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CssSelector {
    /*
      CSS Selector Syntax'i
tagName [attribute = 'value']
input [id = 'twotabsearchbox']

        CSS Selector'de xPath'ten farkli olarak INDEX KULLANAMIYORUZ.


 2- Add Element butonuna basin
Delete butonu’nun gorunur oldugunu test edin
Delete tusuna basin
“Add/Remove Elements” yazisinin gorunur oldugunu test edin


     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://lnkd.in/dCzvU3Uj");

      //  2- Add Element butonuna basin
   WebElement add =driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
           add.click();
  WebElement addBasma= driver.findElement(By.xpath("//*[text()='Add Element']"));
   addBasma.click();

        //Delete butonu’nun gorunur oldugunu test edin
         System.out.println(add.isDisplayed());

 WebElement delete =driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
delete.click();
Thread.sleep(2000);
//“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.out.println(add.isDisplayed());
        Thread.sleep(2000);
        //kapatalim
        driver.close();
    }
}
