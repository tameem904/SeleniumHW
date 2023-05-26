package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.MoreCommonMethods;

public class HwQ07 extends MoreCommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(5000);

        WebElement bMonth = driver.findElement(By.xpath("//select[@id='month']"));
        Select sel1 = new Select(bMonth);
        sel1.selectByValue("4");
        Thread.sleep(2000);

        WebElement bDay = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel2 = new Select(bDay);
        sel2.selectByIndex(27);
        Thread.sleep(2000);

        WebElement bYear = driver.findElement(By.xpath("//select[@id='year']"));
        Select sel3 = new Select(bYear);
        sel3.selectByValue("1985");
        Thread.sleep(2000);






    }
}
