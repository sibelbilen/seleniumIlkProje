package calismalarim.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class c05 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
//         Browser'ı açıp maximize yapın
        driver.get("https://amazon.com");
        driver.manage().window().minimize();


    }
}
