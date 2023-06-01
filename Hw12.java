package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.MoreCommonMethods;

public class Hw12 extends MoreCommonMethods {
    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement dd = driver.findElement(By.xpath("//select[@id='select-demo']"));
        dropDowns(dd,"Wednesday");
    }
}
