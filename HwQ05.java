package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwQ05{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.cssSelector("input[id=\"txtUsername\""));
        userName.sendKeys("Admin");

        WebElement login = driver.findElement(By.cssSelector("input[id=\"btnLogin\""));
        login.click();

        WebElement errorMessage = driver.findElement(By.cssSelector("span[id=\"spanMessage\""));

        if(errorMessage.isDisplayed()){
            System.out.println("Getting right message");
        }
        else{
            System.out.println("should get error message");
        }
    }
}
