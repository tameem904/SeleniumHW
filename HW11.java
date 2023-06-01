package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.MoreCommonMethods;

import java.time.Duration;

public class HW11 extends MoreCommonMethods {
    public static void main(String[] args) {
//If text is available in dom explicit wait
//If text is not available in the dom Implicit
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUser = driver.findElement(By.xpath("//button[@id='save']"));
        getNewUser.click();

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());



    }
}
