package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwQ1 {
    public static void main(String[] args) throws InterruptedException {
        /*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form close the browser
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Joe");
        driver.findElement(By.id("customer.lastName")).sendKeys("Peshi");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Maven Street");
        driver.findElement(By.name("customer.address.city")).sendKeys("Washington");
        driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("20105");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("727-113-5019");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-78901");
        driver.findElement(By.id("customer.username")).sendKeys("Joe999");
        driver.findElement(By.name("customer.password")).sendKeys("JP099All");
        driver.findElement(By.name("repeatedPassword")).sendKeys("JP099All");
        Thread.sleep(2000);
        driver.quit();


    }
}
