package calismalarim.DAY03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

//        a. http://a.testaddressbook.com adresine gidiniz.
//        b. Sign in butonuna basin
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
//ii. Password : Test1234!
//        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
//        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
//        doğrulayin(verify).
//        3. Sayfada kac tane link oldugunu bulun.
//
public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        a. http://a.testaddressbook.com adresine gidiniz.
       driver.get("http://a.testaddressbook.com");
       WebElement buttn=driver.findElement(By.className("btn"));
       buttn.click();

       //  c. email textbox,password textbox, and signin button elementlerini locate ediniz..
//      /  WebElement email=driver.findElement(By.id());
        //WebElement sifre=driver.findElement(By.id());

       // WebElement buton=driver.findElement(By.id());




    }
}
