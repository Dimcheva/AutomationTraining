import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.InterruptedIOException;

public class StaticDD {

    public static void main(String[] args) throws InterruptedIOException {


        System.setProperty("webdriver.chrome.driver", "C:\\myWork\\project assets\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Select s = new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByVisibleText("USD");
    }



}
