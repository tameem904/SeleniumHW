package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.MoreCommonMethods;

public class HwQ06 extends MoreCommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement days = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(days);

        select.selectByVisibleText("Tuesday");
        Thread.sleep(2000);
        select.selectByIndex(5);
        Thread.sleep(2000);
        select.selectByValue("Friday");
        Thread.sleep(2000);
    }
}
