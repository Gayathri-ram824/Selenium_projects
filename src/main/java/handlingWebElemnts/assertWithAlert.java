package handlingWebElemnts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertWithAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#alertbtn")).click();
        Alert al=driver.switchTo().alert();
       // System.out.println(al.getText());
       // Thread.sleep(3000);
        String text=al.getText();

        assert text.contains("Hello"):"Alert is correct";
        al.accept();


//verify the text in alert popup using assert ..assert is a keyword in java which is used to
// verify the condition if the condition is true then
// it will continue the execution of the program
// if the condition is false then it will throw an
// AssertionError and stop the execution of the program
//Assert class is a part of TestNG framework which is used to verify the condition
        // if the condition is true then it will continue the execution of the program
        // if the condition is false then it will throw an AssertionError and stop the execution of the program
//   Assert.assertTrue(alertText.contains("lak"),"Alert text is incorrect");
    }
}
