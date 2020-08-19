import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InterruptedIOException;

public class MultiClickDD {

    public static void main(String[] args) throws  InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\myWork\\project assets\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

//multiclick on "+" button
            for(int i=1;i<5;i++) {
                driver.findElement(By.id("hrefIncAdt")).click();
            }
            driver.findElement(By.id("btnclosepaxoption")).click();
    }
}
