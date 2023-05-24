package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HwQ04{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Tom");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name"));
        lastName.sendKeys("Arnold");

        WebElement email = driver.findElement(By.cssSelector("input[name='email'"));
        email.sendKeys("tomA123@gmail.com");

        WebElement mobile = driver.findElement(By.cssSelector("input[placeholder=\"(845)555-1212\""));
        mobile.sendKeys("510-555-3434");

        WebElement address = driver.findElement(By.cssSelector("input[placeholder=Address"));
        address.sendKeys("211 peacefullterrace rd");

        WebElement city = driver.findElement(By.cssSelector("input[data-bv-field=\"city\""));
        city.sendKeys("San Diego");

        WebElement state = driver.findElement(By.cssSelector("select[name=\"state\""));
        Select selectState=new Select(state);
        selectState.selectByVisibleText("California");

        WebElement zipCode = driver.findElement(By.cssSelector("input[data-bv-field=\"zip\""));
        zipCode.sendKeys("20103");

        WebElement websiteOrDomName = driver.findElement(By.cssSelector("input[placeholder=\"Website or domain name\""));
        websiteOrDomName.sendKeys("www.syntax.com");

        WebElement hosting = driver.findElement(By.cssSelector("div[class=\"radio\""));
        hosting.click();

        WebElement projectDescription = driver.findElement(By.cssSelector("textarea[name=\"comment\""));
        projectDescription.sendKeys("Selenium Vs Java Vs Python");

        WebElement send = driver.findElement(By.cssSelector("button[class=\"btn btn-default\""));
        send.click();
    }
}
