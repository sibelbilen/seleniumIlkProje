package calismalarim.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestCase {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin

4. 'Kaydol / Giriş Yap' düğmesine tıklayın
5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
6. Adı ve e-posta adresini girin
7. 'Kaydol' düğmesini tıklayın
8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
10. 'Bültenimize kaydolun!' onay kutusunu seçin.
11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
13. 'Hesap Oluştur düğmesini' tıklayın
14. 'HESAP OLUŞTURULDU!' görünür
15. 'Devam Et' düğmesini tıklayın
16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
17. 'Hesabı Sil' düğmesini tıklayın
18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın
         */

        // Automation Exercise sitesine git
        driver.get("http://automationexercise.com");
       // 4. 'Kaydol / Giriş Yap' düğmesine tıklayın
WebElement kayit=driver.findElement(By.cssSelector("a[href='login']"));
kayit.click();
    }
}
