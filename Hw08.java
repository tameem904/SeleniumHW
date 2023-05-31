package hW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.MoreCommonMethods;

public class Hw08 extends MoreCommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement promptBox=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptBox.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Tony");

        alert.accept();




    }
}
