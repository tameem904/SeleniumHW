package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.MoreCommonMethods;

import java.time.Duration;

public class Hw10 extends MoreCommonMethods {
    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement element = driver.findElement(By.xpath("//button[@id='startButton']"));
        element.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement text=driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax')]"));
        wait.until(ExpectedConditions.visibilityOf(text));
        System.out.println(text.getText());



    }
}
