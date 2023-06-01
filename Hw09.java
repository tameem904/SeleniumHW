package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.MoreCommonMethods;

public class Hw09 extends MoreCommonMethods {
    public static void main(String[] args) {

        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

      WebElement frame1= driver.findElement(By.xpath("//iframe[@id='frame2']"));
      driver.switchTo().frame(frame1);
      WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
      Select sel = new Select(dd);
      sel.selectByVisibleText("Baby Cat");


      driver.switchTo().defaultContent();

      WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
      driver.switchTo().frame("frame1");
      WebElement textBox=driver.findElement(By.xpath("//input"));
      textBox.sendKeys("MagicMan");
    }
}
