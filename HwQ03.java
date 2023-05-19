package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HwQ03 {
    public static void main(String[] args) throws InterruptedException {
        /* HW  (only use XPATH) navigate to fb.com click on create new account fill up all the textboxes
 close the popup close the browser */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createButton= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createButton.click();
        Thread.sleep(5000);

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Flow");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Stream");
        Thread.sleep(5000);
        WebElement mobileOrEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobileOrEmail.sendKeys("808-101-2010");

        WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
        newPassword.sendKeys("GodIsGreat9966");

        WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
        Select select=new Select(birthMonth);
        select.selectByVisibleText("Apr");

        WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
        Select selectBday=new Select(birthDay);
        selectBday.selectByVisibleText("29");

        WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
        Select selectBirthYear=new Select(birthYear);
        selectBirthYear.selectByVisibleText("1990");

        WebElement sex= driver.findElement((By.xpath("//input[@name='sex' and @value=1]")));
        sex.click();

        Thread.sleep(5000);
        driver.quit();








    }
}
