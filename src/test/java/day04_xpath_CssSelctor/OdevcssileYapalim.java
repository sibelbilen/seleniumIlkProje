package day04_xpath_CssSelctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class OdevcssileYapalim {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://lnkd.in/dCzvU3Uj");
      //  2- Add Element butonuna basin
        WebElement addButonu= driver.findElement(By.cssSelector("button[onclick='addElement()']"));
addButonu.click();
//        Delete butonu’nun gorunur oldugunu test edin
        System.out.println(addButonu.isDisplayed());
//        Delete tusuna basin
        WebElement deletebutton=driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
//“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.out.println(addButonu.isDisplayed());
driver.close();
    }
}
