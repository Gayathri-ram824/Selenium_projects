package handlingWebElemnts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
//1.Simple Alert
        driver.findElement(By.cssSelector("#alertbtn")).click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(3000);
        al.accept();
//2.Confirmation alert
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        Alert al2=driver.switchTo().alert();
        System.out.println(al2.getText());
        Thread.sleep(3000);
        //al2.dismiss();
        al2.accept();
//3.Prompt alert
        driver.findElement(By.cssSelector("#name")).sendKeys("ABC");
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        Alert al3=driver.switchTo().alert();
        System.out.println(al3.getText());
        Thread.sleep(3000);

        String Text= al3.getText();
        assert Text.contains("Hello"):"Alert is correct";
       // Assert.assertTrue(Text.contains("jkkk"), "Alert text is incorrect");

        if(Text.contains("ABC")) {
            System.out.println("Alert is correct");
        }else{
            System.out.println("Alert is not correct");
        }

        al3.accept();


        // al3.dismiss();







    }
}
