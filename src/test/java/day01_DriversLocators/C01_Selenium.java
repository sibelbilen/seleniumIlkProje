package day01_DriversLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class C01_Selenium {


    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        //    System.setProperty("webdriver.http.factory", "jdk-http-client");
/*
en temel haliyle otomosyon yapmak icin classimiza gerekli olan web driver
yerini belirtiyoruz. java kutuphanesindeki " System.setProperty" methoduyla
driverimizin yolunu  yazip fiziki yonunu  belirtiyoruz.
 */
        //   WebDriver driver = new EdgeDriver();
        //    driver.get("https://www.google.com");


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new EdgeDriver();


        driver.get("https://www.google.com");

        Thread.sleep(2000);

    }
}






