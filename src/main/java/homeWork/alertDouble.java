package homeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDouble {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert Alert1= driver.switchTo().alert();
        Alert1.accept();

        Alert Alert2=driver.switchTo().alert();
        Alert2.accept();

    }
}
